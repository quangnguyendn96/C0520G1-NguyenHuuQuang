package java_collection_framwork_map_tree.exercise.manager_product_with_linkedlist;

import java.util.Comparator;

public class Product implements Comparable<java_collection_framwork_map_tree.exercise.manager_product_with_arraylist_linked.Product> {
    @Override
    public int compareTo(java_collection_framwork_map_tree.exercise.manager_product_with_arraylist_linked.Product product2) {
        double i = (this.getPriceProduct() - product2.getPriceProduct()) * 1000;
        return (int) i;
    }

    private String nameProduct;
    private int codeProduct;
    private double priceProduct;

    public Product(String nameProduct, int codeProduct, double kindProduct) {

        this.nameProduct = nameProduct;
        this.codeProduct = codeProduct;
        this.priceProduct = kindProduct;
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

