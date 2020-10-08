package quang.company.furama.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
//@RequiredArgsConstructor
@Data
public class User {
    @Id
    private Long id;

    private  String userName;
    private  String password;
    private  String role;
    private  boolean isEnabled;

    @ManyToMany
    @JoinTable(name = "users_roles")
    private List<Role> roles;

    public User() {}

    public User(String userName, String password, String role, boolean isEnabled) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.isEnabled = isEnabled;
    }

}
