package quang.company.productmodal.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table
public class Product implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;
    private String nameProduct;
    private double priceProduct;
    private String dateImport;
    private String dateExport;
    private boolean statusProduct;


    @ManyToOne()
    @JoinColumn(name = "idCategory")
    Category category;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "product_factory", joinColumns = @JoinColumn(name = "idProduct"), inverseJoinColumns = @JoinColumn(name = "idFactory"))
//    private Set<Factory> factories;

    public String getDateImport() {
        return dateImport;
    }

    public void setDateImport(String dateImport) {
        this.dateImport = dateImport;
    }

    public String getDateExport() {
        return dateExport;
    }

    public void setDateExport(String dateExport) {
        this.dateExport = dateExport;
    }

    public boolean isStatusProduct() {
        return statusProduct;
    }

//    public Set<Factory> getFactories() {
//        return factories;
//    }
//
//    public void setFactories(Set<Factory> factories) {
//        this.factories = factories;
//    }

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

    public boolean getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(boolean statusProduct) {
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
