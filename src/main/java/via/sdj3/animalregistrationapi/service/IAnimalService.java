package via.sdj3.animalregistrationapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import via.sdj3.animalregistrationapi.model.Animal;
import via.sdj3.animalregistrationapi.model.dto.AnimalDto;

import java.util.List;


public interface IAnimalService {

    Animal create(AnimalDto animalDto);
    Animal getById(int id);
    void update(AnimalDto animalDto);
    void delete(int id);
    List<Animal> getAll();
    List<Animal> getByOrigin(String origin);
    List<Animal> getByDate(String date);

    List<Integer> getRegistrationsNumberInProduct( int id);

}
