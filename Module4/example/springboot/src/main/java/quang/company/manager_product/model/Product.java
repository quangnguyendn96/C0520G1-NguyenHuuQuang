package quang.company.manager_product.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;


@Entity
@Table
public class Product implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;
    private String nameProduct;
    private double priceProduct;
    private String statusProduct;


    @ManyToOne()
    @JoinColumn(name = "idCategory")
    Category category;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        Product product = (Product) target;
        if (product.getNameProduct().isEmpty()) {
            errors.rejectValue("nameProduct", "nameProduct.notEmpty");
        }
        if (product.getPriceProduct() < 0) {
            errors.rejectValue("priceProduct", "priceProduct.position");
        }
    }
}
