package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class TypeRent {
    @Id
    private long idTypeRent;
    private String nameTypeRent;
    private double priceRent;

    @OneToMany(mappedBy = "typeRent", cascade = CascadeType.ALL)
    Collection<Services> services;

    public TypeRent() {
    }

    public long getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(long idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getNameTypeRent() {
        return nameTypeRent;
    }

    public void setNameTypeRent(String nameTypeRent) {
        this.nameTypeRent = nameTypeRent;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }

    public Collection<Services> getServices() {
        return services;
    }

    public void setServices(Collection<Services> services) {
        this.services = services;
    }
}
