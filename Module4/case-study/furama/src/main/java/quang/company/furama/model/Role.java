package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idRole;
    private String nameRole;

//    @ManyToMany(mappedBy = "roles")
//    private List<User> users;

    public Role() {
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "role_user", joinColumns = @JoinColumn(name = "idRole"), inverseJoinColumns = @JoinColumn(name = "id"))
    private Set<User> users;

    public long getIdRole() {
        return idRole;
    }

    public void setIdRole(long idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
