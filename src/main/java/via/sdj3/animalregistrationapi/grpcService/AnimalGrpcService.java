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
public class AnimalGrpcService extends AnimalsServiceGrpc.AnimalsServiceImplBase {

    private AnimalRepository animalRepository;
    private ProductRepository productRepository;

    public AnimalGrpcService(AnimalRepository animalRepository, ProductRepository productRepository)
    {
        this.animalRepository = animalRepository;
        this.productRepository =productRepository;
    }

    @Override
    public void createAnimal(AnimalMessage request, StreamObserver<AnimalMessage> responseObserver) {

        Animal animal = new Animal(request.getDate(),request.getWeight(), request.getRegistrationNumber(), request.getOrigin());
        animalRepository.save(animal);
        responseObserver.onNext(request);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteAnimal(IdMessage request, StreamObserver<NullMessage> responseObserver) {
        Animal animal = animalRepository.findById(request.getId()).get();

        for(Product product : animal.getProducts())
        {
            product.getUsedAnimals().remove(animal);
        }

        animalRepository.delete(animal);
        responseObserver.onNext(NullMessage.newBuilder().build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAll(NullMessage request, StreamObserver<AnimalListMessage> responseObserver) {
        List<Animal> animals = (List<Animal>) animalRepository.findAll();
        List<AnimalMessage> messages = new ArrayList<>();
        for(Animal animal : animals)
        {
            AnimalMessage message = createAnimalMessage(animal);
            messages.add(message);
        }
        AnimalListMessage animalListMessage = AnimalListMessage.newBuilder().addAllAnimals(messages).build();
        responseObserver.onNext(animalListMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalById(IdMessage request, StreamObserver<AnimalMessage> responseObserver) {
        Animal animal = animalRepository.findById(request.getId()).get();
        AnimalMessage message = createAnimalMessage(animal);
        responseObserver.onNext(message);
        responseObserver.onCompleted();

    }

    @Override
    public void getByOrigin(StringParameterMessage request, StreamObserver<AnimalListMessage> responseObserver) {
        List<Animal> animals =  animalRepository.findByOrigin(request.getValue());
        List<AnimalMessage> messages = new ArrayList<>();
        for(Animal animal : animals)
        {
            AnimalMessage message = createAnimalMessage(animal);
            messages.add(message);
        }
        AnimalListMessage animalListMessage = AnimalListMessage.newBuilder().addAllAnimals(messages).build();
        responseObserver.onNext(animalListMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getByDate(StringParameterMessage request, StreamObserver<AnimalListMessage> responseObserver) {
        List<Animal> animals =  animalRepository.findByDate(request.getValue());
        List<AnimalMessage> messages = new ArrayList<>();
        for(Animal animal : animals)
        {
            AnimalMessage message = createAnimalMessage(animal);
            messages.add(message);
        }
        AnimalListMessage animalListMessage = AnimalListMessage.newBuilder().addAllAnimals(messages).build();
        responseObserver.onNext(animalListMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void getRegistrationNumbersOfAnimalsInvolvedInProduct(IdMessage request, StreamObserver<RegistrationNumbersMessage> responseObserver) {
        Product product = productRepository.findById(request.getId()).get();
        List<Animal> animals = product.getUsedAnimals();
        List<Integer> ids = new ArrayList<>();
        for(Animal animal : animals)
        {
            ids.add(animal.getRegistrationNumber());
        }
        RegistrationNumbersMessage registrationNumbersMessage = RegistrationNumbersMessage.newBuilder().addAllRegistrationNumbers(ids).build();
        responseObserver.onNext(registrationNumbersMessage);
        responseObserver.onCompleted();
    }

    @Override
    public void updateAnimal(AnimalMessage request, StreamObserver<NullMessage> responseObserver) {
        if(animalRepository.findById(request.getRegistrationNumber()).isPresent())
        {
            Animal animal = animalRepository.findById(request.getRegistrationNumber()).get();
            animal.setDate(request.getDate());
            animal.setOrigin(request.getOrigin());
            animal.setWeight(request.getWeight());
            animal.setRegistrationNumber(request.getRegistrationNumber());
            animalRepository.save(animal);
        }
        else
        {
            Animal animal = new Animal(request.getDate(),request.getWeight(), request.getRegistrationNumber(), request.getOrigin());
            animalRepository.save(animal);
        }
        responseObserver.onNext(NullMessage.newBuilder().build());
        responseObserver.onCompleted();
    }

    private AnimalMessage createAnimalMessage(Animal animal)
    {
        AnimalMessage message = AnimalMessage.newBuilder().setDate(animal.getDate())
                .setOrigin(animal.getOrigin())
                .setWeight(animal.getWeight())
                .setRegistrationNumber(animal.getRegistrationNumber()).build();
        return message;
    }
}
