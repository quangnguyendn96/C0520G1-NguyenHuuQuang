package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class TypeCustomer {
    @Id
    private long idTypeCustomer;
    private String nameTypeCustomer;

    @OneToMany(mappedBy = "typeCustomer", cascade = CascadeType.ALL)
    Collection<Customer> customers;

}
