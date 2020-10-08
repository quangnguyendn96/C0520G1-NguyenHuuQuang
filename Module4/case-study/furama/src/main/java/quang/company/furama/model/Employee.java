package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class Employee {
    @Id
    private long idEmployee;
    private String nameEmployee;
    private String dayOfBirth;
    private String identityCardEmployee;
    private double salary;
    private String phoneNumber;
    private String emailEmployee;
    private String addressEmployee;
    private String username;

    @ManyToOne()
    @JoinColumn(name = "idPositive")
    Positive positive;

    @ManyToOne()
    @JoinColumn(name = "idEducationDegree")
    EducationDegree educationDegree;

    @ManyToOne()
    @JoinColumn(name = "idDivision")
    Division division;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    Collection<Contract> contracts;

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
}
