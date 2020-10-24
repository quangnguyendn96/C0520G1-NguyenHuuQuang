package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class TypeCustomer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTypeCustomer;
    private String nameTypeCustomer;

    @OneToMany(mappedBy = "typeCustomer", cascade = CascadeType.ALL)
    Collection<Customer> customers;

    public long getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(long idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public String getNameTypeCustomer() {
        return nameTypeCustomer;
    }

    public void setNameTypeCustomer(String nameTypeCustomer) {
        this.nameTypeCustomer = nameTypeCustomer;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Collection<Customer> customers) {
        this.customers = customers;
    }
}
