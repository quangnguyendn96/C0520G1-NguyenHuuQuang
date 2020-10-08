package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class Customer {
    @Id
    private long idCustomer;
    private String nameCustomer;
    private String dayOfBirthCustomer;
    private int genderCustomer;
    private int identityCard;
    private String phoneCustomer;
    private String emailCustomer;
    private String addCustomer;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    Collection<Contract> contracts;

    @ManyToOne()
    @JoinColumn(name = "idTypeCustomer")
    TypeCustomer typeCustomer;

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }


}
