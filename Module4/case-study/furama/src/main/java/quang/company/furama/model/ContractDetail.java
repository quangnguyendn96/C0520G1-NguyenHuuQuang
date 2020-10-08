package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class ContractDetail {
    @Id
    private long idContractDetail;

    private double amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idContract", referencedColumnName = "idContract")
    private Contract contract;

    @ManyToOne()
    @JoinColumn(name = "idServiceIncluded")
    ServiceIncluded serviceIncluded;


}
