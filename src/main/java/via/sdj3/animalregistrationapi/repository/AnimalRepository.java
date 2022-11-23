package via.sdj3.animalregistrationapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationapi.model.Animal;

import java.util.*;

@Repository
public interface AnimalRepository extends CrudRepository<Animal,Integer> {




     List<Animal> findByOrigin(String origin);


     List<Animal> findByDate(String date);

}
