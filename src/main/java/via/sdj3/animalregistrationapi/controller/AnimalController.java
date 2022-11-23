package via.sdj3.animalregistrationapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import via.sdj3.animalregistrationapi.model.Animal;
import via.sdj3.animalregistrationapi.model.dto.AnimalDto;
import via.sdj3.animalregistrationapi.service.IAnimalService;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalController {
    private IAnimalService service;

    public AnimalController(IAnimalService service){
        this.service = service;
    }

    @RequestMapping(value="animals/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Animal getAnimalById(@PathVariable int id) {
        return service.getById(id);
    }



    @RequestMapping(value="animals", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Animal> getAnimals(@RequestParam(required = false, name = "origin") String origin, @RequestParam(required = false, name ="date") String date ) {
        if(origin != null)
        {
            return service.getByOrigin(origin);
        }
        if(date != null)
        {
            return service.getByDate(date);
        }
        return   service.getAll();
    }
    @RequestMapping(value="animals/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Integer> getRegistrationsNumbersOfAnimalsIncludedInProduct(@PathVariable int id)
    {
        return service.getRegistrationsNumberInProduct(id);
    }

    @RequestMapping(value="/animals", method = RequestMethod.PATCH)
    public void updateAnimal(@RequestBody AnimalDto animalDto) {
         service.update(animalDto);
    }

    @RequestMapping(value="/animals", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Animal createAnimal(@RequestBody AnimalDto animalDto) {
        return service.create(animalDto);
    }

    @RequestMapping(value="/animals/{id}", method = RequestMethod.DELETE)
    public void deleteAnimal(@PathVariable int id) {
         service.delete(id);
    }
}

