package via.sdj3.animalregistrationapi.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationapi.model.Animal;
import via.sdj3.animalregistrationapi.model.Product;
import via.sdj3.animalregistrationapi.model.dto.ProductDto;
import via.sdj3.animalregistrationapi.protobuf.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService{

    private final ProductsServiceGrpc.ProductsServiceBlockingStub stub;

    public ProductService()
    {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 5434)
                .usePlaintext()
                .build();
        stub = ProductsServiceGrpc.newBlockingStub(managedChannel);
    }
    @Override
    public Product getById(int id) {
        ProductMessage message = stub.getProductById(IdMessage.newBuilder().setId(id).build());
        return getProductFromGrpcMessage(message);
    }

    @Override
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        ProductListMessage responseMessageList = stub.getAll(NullMessage.newBuilder().build());

        return getProductsFromGrpcMessage(list, responseMessageList);
    }

    @Override
    public List<Product> getProductsByAnimal(int registrationNumber) {
        List<Product> list = new ArrayList<>();
        ProductListMessage responseMessageList = stub.getByAnimal(IdMessage.newBuilder().setId(registrationNumber).build());

        return getProductsFromGrpcMessage(list, responseMessageList);
    }

    private List<Product> getProductsFromGrpcMessage(List<Product> list, ProductListMessage responseMessageList) {
        for(ProductMessage responseMessage: responseMessageList.getAnimalsList())
        {
            ArrayList<Animal> animalsList = new ArrayList<>();
            AnimalListMessage animalsListMessage = responseMessage.getAnimals();

            for(AnimalMessage animalMessage: animalsListMessage.getAnimalsList())
            {
                Animal animal = new Animal(animalMessage.getDate(),animalMessage.getWeight(),animalMessage.getRegistrationNumber(), animalMessage.getOrigin());
                animalsList.add(animal);
            }

            Product product = new Product(animalsList,responseMessage.getName(),responseMessage.getId(), responseMessage.getPrice());
            list.add(product);
        }

        return list;
    }

    @Override
    public Product create(ProductDto productDto) {

        ProductMessageCreate createMessage = ProductMessageCreate.newBuilder().setId(productDto.getId())
                .setName(productDto.getName()).setPrice(productDto.getPrice())
                .addAllAnimalsIds(productDto.getAnimalsIds()).build();
        ProductMessage message = stub.createProduct(createMessage);
        return getProductFromGrpcMessage(message);
    }

    private Product getProductFromGrpcMessage(ProductMessage message) {
        ArrayList<Animal> animalsList = new ArrayList<>();
        AnimalListMessage animalsListMessage = message.getAnimals();

        for(AnimalMessage animalMessage: animalsListMessage.getAnimalsList())
        {
            Animal animal = new Animal(animalMessage.getDate(),animalMessage.getWeight(),animalMessage.getRegistrationNumber(), animalMessage.getOrigin());
            animalsList.add(animal);
        }

        Product product = new Product(animalsList,message.getName(),message.getId(), message.getPrice());

        return product;
    }

    @Override
    public void delete(int id) {
        stub.deleteProduct(IdMessage.newBuilder().setId(id).build());
    }
}
