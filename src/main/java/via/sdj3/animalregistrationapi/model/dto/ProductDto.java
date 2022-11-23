package via.sdj3.animalregistrationapi.model.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

public class ProductDto {
    private String name;

    private int id;
    private double price;

    private ArrayList<Integer> animalsIds;

    public ProductDto(String name, int id, double price, ArrayList<Integer> animalsIds) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.animalsIds = animalsIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Integer> getAnimalsIds() {
        return animalsIds;
    }

    public void setAnimalsIds(ArrayList<Integer> animalsIds) {
        this.animalsIds = animalsIds;
    }
}
