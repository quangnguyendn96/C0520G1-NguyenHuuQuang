package quang.company.model;

import javax.persistence.*;


@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idCustomer;

    String nameCustomer;
    String typeCustomer;
    String genderCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String typeCustomer, String genderCustomer) {
        this.nameCustomer = nameCustomer;
        this.typeCustomer = typeCustomer;
        this.genderCustomer = genderCustomer;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }
}
