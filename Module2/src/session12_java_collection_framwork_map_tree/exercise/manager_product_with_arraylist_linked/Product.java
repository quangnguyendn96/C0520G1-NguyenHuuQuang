package session12_java_collection_framwork_map_tree.exercise.manager_product_with_arraylist_linked;

public class Product implements Comparable<Product> {
    @Override
    public int compareTo(Product product2) {
        double i = (this.getPriceProduct() - product2.getPriceProduct())*1000;
        return (int) i;
    }

    private String nameProduct;
    private int codeProduct;
    private double priceProduct;

    public Product(String nameProduct, int codeProduct, double priceProduct) {

        this.nameProduct = nameProduct;
        this.codeProduct = codeProduct;
        this.priceProduct = priceProduct;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct = " + nameProduct + '\'' +
                ", codeProduct = " + codeProduct +
                ", kindProduct = " + priceProduct + '\'' +
                '}';
    }
}
