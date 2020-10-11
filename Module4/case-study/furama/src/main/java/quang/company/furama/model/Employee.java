package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

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

    public Employee() {
    }

    public long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdentityCardEmployee() {
        return identityCardEmployee;
    }

    public void setIdentityCardEmployee(String identityCardEmployee) {
        this.identityCardEmployee = identityCardEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Positive getPositive() {
        return positive;
    }

    public void setPositive(Positive positive) {
        this.positive = positive;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
}
