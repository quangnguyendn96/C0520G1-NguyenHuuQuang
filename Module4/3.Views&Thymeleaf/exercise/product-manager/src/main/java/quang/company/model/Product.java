package quang.company.model;

public class Product {
    private int id;
    private String name;
    private String kind;
    private double price;

    public Product(int id, String name, String kind, double price) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.price = price;
    }

    public Product() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
