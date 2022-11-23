package via.sdj3.animalregistrationapi.service;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationapi.model.Animal;

import via.sdj3.animalregistrationapi.model.Product;
import via.sdj3.animalregistrationapi.model.dto.AnimalDto;
import via.sdj3.animalregistrationapi.protobuf.*;
import via.sdj3.animalregistrationapi.repository.AnimalRepository;
import via.sdj3.animalregistrationapi.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService implements IAnimalService  {

    private final AnimalsServiceGrpc.AnimalsServiceBlockingStub stub;

    public AnimalService()
    {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 5434)
                .usePlaintext()
                .build();
        stub = AnimalsServiceGrpc.newBlockingStub(managedChannel);
    }


    @Override
    public Animal create(AnimalDto animalDto) {
       return createOrUpdateAnimal(animalDto);
    }

    private Animal createOrUpdateAnimal(AnimalDto animalDto) {
        AnimalMessage animalMessage = AnimalMessage.newBuilder().setDate(animalDto.getDate()).setOrigin(animalDto.getOrigin())
                .setRegistrationNumber(animalDto.getRegistrationNumber()).setWeight(animalDto.getWeight()).build();

        AnimalMessage responseMessage = stub.createAnimal(animalMessage);
        Animal animal = new Animal(responseMessage.getDate(),responseMessage.getWeight(),responseMessage.getRegistrationNumber(), responseMessage.getOrigin());
            return animal;

    }

    @Override
    public Animal getById(int id) {
        AnimalMessage responseMessage = stub.getAnimalById(IdMessage.newBuilder().setId(id).build());
        Animal animal = new Animal(responseMessage.getDate(),responseMessage.getWeight(),responseMessage.getRegistrationNumber(), responseMessage.getOrigin());
        return animal;

    }

    @Override
    public void update(AnimalDto animalDto) {
        createOrUpdateAnimal(animalDto);
    }


    @Override
    public void delete(int id) {
        stub.deleteAnimal(IdMessage.newBuilder().setId(id).build());
    }

    @Override
    public List<Animal> getAll() {
        List<Animal> list = new ArrayList<>();
        AnimalListMessage responseMessageList = stub.getAll(NullMessage.newBuilder().build());

        for(AnimalMessage responseMessage: responseMessageList.getAnimalsList())
        {
            Animal animal = new Animal(responseMessage.getDate(),responseMessage.getWeight(),responseMessage.getRegistrationNumber(), responseMessage.getOrigin());
            list.add(animal);
        }

        return list;
    }

    @Override
    public List<Animal> getByOrigin(String origin) {
        return getAnimalsByParameter(origin);
    }

    @Override
    public List<Animal> getByDate(String date) {
        return getAnimalsByParameter(date);
    }

    private List<Animal> getAnimalsByParameter(String value) {
        List<Animal> list = new ArrayList<>();
        AnimalListMessage responseMessageList = stub.getByOrigin(StringParameterMessage.newBuilder().setValue(value).build());

        for(AnimalMessage responseMessage: responseMessageList.getAnimalsList())
        {
            Animal animal = new Animal(responseMessage.getDate(),responseMessage.getWeight(),responseMessage.getRegistrationNumber(), responseMessage.getOrigin());
            list.add(animal);
        }

        return list;
    }

    @Override
    public List<Integer> getRegistrationsNumberInProduct(int id) {

        RegistrationNumbersMessage responseMessageList = stub.getRegistrationNumbersOfAnimalsInvolvedInProduct(IdMessage.newBuilder().setId(id).build());

        return responseMessageList.getRegistrationNumbersList();
    }
}
