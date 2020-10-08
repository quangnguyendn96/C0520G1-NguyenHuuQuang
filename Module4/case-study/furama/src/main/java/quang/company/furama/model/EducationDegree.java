package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class EducationDegree {
    @Id
    private long idEducationDegree;
    private String nameEducationDegree;

    @OneToMany(mappedBy = "educationDegree", cascade = CascadeType.ALL)
    Collection<Employee> employees;
}
