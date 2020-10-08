package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class ServiceIncluded {
    @Id
    private long idServiceIncluded;
    private String nameServiceIncluded;
    private double price;
    private int unit;

    @OneToMany(mappedBy = "serviceIncluded", cascade = CascadeType.ALL)
    Collection<ContractDetail> contractDetails;
}
