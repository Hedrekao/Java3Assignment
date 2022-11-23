package via.sdj3.animalregistrationapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.*;

@Entity
public class Animal {
    private String date;
    private double weight;
    @Id
    private int registrationNumber;
    private String origin;

    @ManyToMany(mappedBy = "usedAnimals", fetch = FetchType.EAGER, cascade = REMOVE)
    @JsonIgnore()
    private List<Product> products;

    protected Animal() {}

    public Animal(String date, double weight, int registrationNumber, String origin) {
        this.date = date;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.origin = origin;
        this.products = null;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
