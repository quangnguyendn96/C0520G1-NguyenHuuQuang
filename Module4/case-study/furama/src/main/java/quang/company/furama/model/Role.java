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
}
