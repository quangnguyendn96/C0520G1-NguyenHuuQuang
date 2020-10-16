package quang.company.furama.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
//@RequiredArgsConstructor
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String userName;
    private  String password;
    private  boolean isEnabled;

    @ManyToMany(mappedBy = "users")
    private Set<Role> roles;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//    private Set<Employee> employees;
///
//    @ManyToMany
//    @JoinTable(name = "users_roles")
//    private List<Role> roles;

    public User() {}

    public User(String userName, String password, boolean isEnabled, Set<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.isEnabled = isEnabled;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

//    public List<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(List<Role> roles) {
//        this.roles = roles;
//    }
}
