package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

public class Division {
    @Id
    private long idDivision;
    private String nameDivision;

    @OneToMany(mappedBy = "division", cascade = CascadeType.ALL)
    Collection<Employee> employees;


    public Division() {
    }

    public long getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(long idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
