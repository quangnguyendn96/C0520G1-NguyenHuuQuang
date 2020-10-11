package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table
@Data
public class Role {
    @Id
    private long idRole;
    private String nameRole;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role() {
    }

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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
