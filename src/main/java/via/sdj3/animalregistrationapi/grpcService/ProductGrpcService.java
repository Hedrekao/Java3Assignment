package via.sdj3.animalregistrationapi.grpcService;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sdj3.animalregistrationapi.model.Animal;
import via.sdj3.animalregistrationapi.model.Product;
import via.sdj3.animalregistrationapi.protobuf.*;
import via.sdj3.animalregistrationapi.repository.AnimalRepository;
import via.sdj3.animalregistrationapi.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@GRpcService
public class ProductGrpcService extends ProductsServiceGrpc.ProductsServiceImplBase {

    private ProductRepository productRepository;
    private AnimalRepository animalRepository;

    public ProductGrpcService(ProductRepository productRepository, AnimalRepository animalRepository)
    {
        this.productRepository = productRepository;
        this.animalRepository = animalRepository;
    }

    @Override
    public void createProduct(ProductMessageCreate request, StreamObserver<ProductMessage> responseObserver) {
        List<Animal> animals = (List<Animal>) animalRepository.findAllById(request.getAnimalsIdsList());
        Product product = new Product((ArrayList<Animal>) animals,request.getName(),request.getId(),request.getPrice());
        productRepository.save(product);
        ProductMessage responseMessage = createProductMessage(product);
        responseObserver.onNext(responseMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteProduct(IdMessage request, StreamObserver<NullMessage> responseObserver) {

        productRepository.deleteById(request.getId());
        responseObserver.onNext(NullMessage.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getByAnimal(IdMessage request, StreamObserver<ProductListMessage> responseObserver) {
        List<Product> products =  productRepository.findAllByUsedAnimals_RegistrationNumber(request.getId());
        List<ProductMessage> productMessages = new ArrayList<>();;
        for(Product product : products)
        {
            ProductMessage responseMessage = createProductMessage(product);
            productMessages.add(responseMessage);
        }

        ProductListMessage responseMessage = ProductListMessage.newBuilder().addAllAnimals(productMessages).build();
        responseObserver.onNext(responseMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getAll(NullMessage request, StreamObserver<ProductListMessage> responseObserver) {
        List<Product> products = (List<Product>) productRepository.findAll();
        List<ProductMessage> productMessages = new ArrayList<>();;
        for(Product product : products)
        {
            ProductMessage responseMessage = createProductMessage(product);
            productMessages.add(responseMessage);
        }

        ProductListMessage responseMessage = ProductListMessage.newBuilder().addAllAnimals(productMessages).build();
        responseObserver.onNext(responseMessage);
        responseObserver.onCompleted();
    }

    private ProductMessage createProductMessage(Product product) {
        List<Animal> animals = product.getUsedAnimals();
        List<AnimalMessage> animalMessages = new ArrayList<>();
        for(Animal animal : animals)
        {
            AnimalMessage animalMessage = AnimalMessage.newBuilder().setWeight(animal.getWeight())
                    .setDate(animal.getDate())
                    .setOrigin(animal.getOrigin())
                    .setRegistrationNumber(animal.getRegistrationNumber()).build();

            animalMessages.add(animalMessage);
        }
        AnimalListMessage list = AnimalListMessage.newBuilder().addAllAnimals(animalMessages).build();
        ProductMessage responseMessage = ProductMessage.newBuilder().setId(product.getId())
                .setName(product.getName())
                .setPrice(product.getPrice())
                .setAnimals(list).build();

        return responseMessage;
    }

    @Override
    public void getProductById(IdMessage request, StreamObserver<ProductMessage> responseObserver) {
        int id = request.getId();
        Product product = productRepository.findById(id).get();

        ProductMessage responseMessage = createProductMessage(product);
        responseObserver.onNext(responseMessage);
        responseObserver.onCompleted();
    }


}
