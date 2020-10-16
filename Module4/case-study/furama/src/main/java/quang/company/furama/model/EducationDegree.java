package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEducationDegree;
    private String nameEducationDegree;

    @OneToMany(mappedBy = "educationDegree", cascade = CascadeType.ALL)
    Collection<Employee> employees;

    public EducationDegree() {
    }

    public long getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(long idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
