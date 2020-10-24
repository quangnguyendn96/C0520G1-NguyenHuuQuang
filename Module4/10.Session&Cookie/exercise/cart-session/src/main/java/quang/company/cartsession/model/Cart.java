package quang.company.cartsession.model;

import org.springframework.stereotype.Component;

@Component
public class Cart {
    private CdProduct cdProduct;
    private int quantity;

    public Cart() {
    }

    public Cart(CdProduct cdProduct, int quantity) {
        this.cdProduct = cdProduct;
        this.quantity = quantity;
    }

    public CdProduct getCdProduct() {
        return cdProduct;
    }

    public void setCdProduct(CdProduct cdProduct) {
        this.cdProduct = cdProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
