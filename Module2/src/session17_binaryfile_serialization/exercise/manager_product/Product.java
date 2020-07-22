package session17_binaryfile_serialization.exercise.manager_product;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int id;
    private String manufactor;
    private double price;
    private String other;
    public Product(){};

    public Product(String name, int id, String manufactor, double price, String other) {
        this.name = name;
        this.id = id;
        this.manufactor = manufactor;
        this.price = price;
        this.other = other;
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

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name= " + name + '\'' +
                ", id= " + id +
                ", manufactor= " + manufactor + '\'' +
                ", price= " + price +
                ", other= " + other + '\'' +
                '}';
    }
}
