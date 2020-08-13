package finalCourse.product;

public abstract class Product {
    String idProduct;
    String codeProduct;
    double priceProduct;
    String numberProduct;
    String nameManufacture;

    public Product(String idProduct, String codeProduct, double priceProduct, String numberProduct, String nameManufacture) {
        this.idProduct = idProduct;
        this.codeProduct = codeProduct;
        this.priceProduct = priceProduct;
        this.numberProduct = numberProduct;
        this.nameManufacture = nameManufacture;
    }
}
