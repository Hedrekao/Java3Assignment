package via.sdj3.animalregistrationapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationapi.model.Product;
import via.sdj3.animalregistrationapi.model.dto.AnimalDto;
import via.sdj3.animalregistrationapi.model.dto.ProductDto;
import via.sdj3.animalregistrationapi.service.IProductService;

import java.util.List;
@RestController
@RequestMapping("/")
public class ProductController {

    private IProductService service;

    public ProductController(IProductService service){
        this.service = service;
    }

    @RequestMapping(value="products/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product getProductById(@PathVariable int id) {
        return service.getById(id);
    }



    @RequestMapping(value="products", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getProducts(){
        return   service.getAll();
    }

    @RequestMapping(value="products/animal/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getProductsByAnimal(@PathVariable int id){
        return   service.getProductsByAnimal(id);
    }



    @RequestMapping(value="/products", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product createProduct(@RequestBody ProductDto productDto) {
        return service.create(productDto);
    }

    @RequestMapping(value="/products/{id}", method = RequestMethod.DELETE)
    public void deleteProduct(@PathVariable int id) {
        service.delete(id);
    }
}
