package model;

public class Product {
    private String id;
    private String name;
    private String price;
    private String amountNumber;
    private String color;
    private String description;
    private String category;


    public Product(String id, String name, String price, String amountNumber, String color, String description, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amountNumber = amountNumber;
        this.color = color;
        this.description = description;
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmountNumber() {
        return amountNumber;
    }

    public void setAmountNumber(String amountNumber) {
        this.amountNumber = amountNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
