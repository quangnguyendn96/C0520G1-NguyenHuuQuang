package quang.company.furama.model;



import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Collection;

@Entity
@Table

public class Employee  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmployee;
    @NotEmpty
    private String nameEmployee;
    @NotEmpty
    private String dayOfBirth;
    @Pattern(regexp = "^[\\d]{9}$", message = "IdCard must be have 9 number")
    private String identityCardEmployee;
    private double salary;
    @Pattern(regexp = "^(09[01][\\d]{7})||(84\\+9[01][\\d]{7})$", message = "Phone number start 090 or 091")
    private String phoneNumber;
    @Pattern(regexp = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$",message = "Not right email")
    private String emailEmployee;
    @NotEmpty
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
