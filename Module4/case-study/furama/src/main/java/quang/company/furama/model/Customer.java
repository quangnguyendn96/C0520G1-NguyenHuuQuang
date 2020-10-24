package quang.company.furama.model;

import org.springframework.security.core.parameters.P;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Collection;

@Entity
@Table
public class Customer {
    @Id
    @Pattern(regexp = "^DV-[\\d]{4}$", message = "Not right")
    private String idCustomer;
    @NotEmpty
    private String nameCustomer;
    private String dayOfBirthCustomer;

    private int genderCustomer;

    @Pattern(regexp = "^[\\d]{9}$", message = "IdCard must be have 9 number")
    private int identityCard;
    @Pattern(regexp = "^(09[01][\\d]{7})||(84\\+9[01][\\d]{7})$", message = "Phone number start 090 or 091")
    private String phoneCustomer;
    @Pattern(regexp = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Not right email")
    private String emailCustomer;
    @NotEmpty
    private String addCustomer;

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    Collection<Contract> contracts;

    @ManyToOne()
    @JoinColumn(name = "idTypeCustomer")
    TypeCustomer typeCustomer;

    public Customer() {
    }

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
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
