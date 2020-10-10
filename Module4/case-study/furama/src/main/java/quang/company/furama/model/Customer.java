package quang.company.furama.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table


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

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
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

    public long getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirthCustomer() {
        return dayOfBirthCustomer;
    }

    public void setDayOfBirthCustomer(String dayOfBirthCustomer) {
        this.dayOfBirthCustomer = dayOfBirthCustomer;
    }

    public int getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(int genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddCustomer() {
        return addCustomer;
    }

    public void setAddCustomer(String addCustomer) {
        this.addCustomer = addCustomer;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
