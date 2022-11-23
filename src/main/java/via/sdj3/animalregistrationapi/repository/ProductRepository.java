package via.sdj3.animalregistrationapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.animalregistrationapi.model.Animal;
import via.sdj3.animalregistrationapi.model.Product;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAllByUsedAnimals_RegistrationNumber(int registrationNumber);
}
