package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class TypeRent {
    @Id
    private long idTypeRent;
    private String nameTypeRent;
    private double priceRent;

    @OneToMany(mappedBy = "typeRent", cascade = CascadeType.ALL)
    Collection<Service> services;
}
