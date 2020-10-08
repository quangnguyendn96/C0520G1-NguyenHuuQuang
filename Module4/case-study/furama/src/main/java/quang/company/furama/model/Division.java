package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class Division {
    @Id
    private long idDivision;
    private String nameDivision;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    Collection<Employee> employees;

}
