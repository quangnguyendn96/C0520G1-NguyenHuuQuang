package quang.company.model;

import org.springframework.stereotype.Component;

@Component
public class Cart {
    private CdProduct cdProduct;
    private int quantity;

    public Cart() {
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
