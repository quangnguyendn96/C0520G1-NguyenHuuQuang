package quang.company.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idUSer;
    @Size(min = 5, max = 45)
    String firstName;
    @Size(min = 5, max = 45)
    String lastName;
    @Pattern(regexp = "^(09[01][\\d]{7})||(84\\+9[01][\\d]{7})$")
    String phoneNumber;
    @Min(18)
    String age;

    @Pattern(regexp = "^[\\w]{3,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    String email;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User() {
    }

    public Long getIdUSer() {
        return idUSer;
    }

    public void setIdUSer(Long idUSer) {
        this.idUSer = idUSer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
