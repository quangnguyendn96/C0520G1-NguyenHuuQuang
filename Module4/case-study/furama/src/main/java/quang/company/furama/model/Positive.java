package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Table
@Entity
@Data
public class Positive {
    @Id
    private long idPositive;
    private String namePositive;

    @OneToMany(mappedBy = "positive", cascade = CascadeType.ALL)
    Collection<Employee> employees;
}
