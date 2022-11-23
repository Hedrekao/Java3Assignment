package via.sdj3.animalregistrationapi.service;

import org.springframework.stereotype.Service;
import via.sdj3.animalregistrationapi.model.Product;
import via.sdj3.animalregistrationapi.model.dto.ProductDto;

import java.util.List;

public interface IProductService {

    Product getById(int id);
    List<Product> getAll();
    List<Product> getProductsByAnimal(int registrationNumber);

    Product create(ProductDto productDto);

    void delete(int id);


}
