package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Table
@Entity

public class Positive {
    @Id
    private long idPositive;
    private String namePositive;

    @OneToMany(mappedBy = "positive", cascade = CascadeType.ALL)
    Collection<Employee> employees;

    public Positive() {
    }

    public long getIdPositive() {
        return idPositive;
    }

    public void setIdPositive(long idPositive) {
        this.idPositive = idPositive;
    }

    public String getNamePositive() {
        return namePositive;
    }

    public void setNamePositive(String namePositive) {
        this.namePositive = namePositive;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
}
