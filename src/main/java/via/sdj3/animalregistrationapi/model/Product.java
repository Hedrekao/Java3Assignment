package via.sdj3.animalregistrationapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Product
{
    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("product")
    private List<Animal> usedAnimals;
    private String name;

    @Id
    @GeneratedValue()
    private int id;
    private double price;

    protected Product() {}

    public Product(ArrayList<Animal> usedAnimals, String name, int id, double price)
    {
        this.usedAnimals = usedAnimals;
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public List<Animal> getUsedAnimals()
    {
        return usedAnimals;
    }

    public void setUsedAnimals(ArrayList<Animal> usedAnimals)
    {
        this.usedAnimals = usedAnimals;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }
}
