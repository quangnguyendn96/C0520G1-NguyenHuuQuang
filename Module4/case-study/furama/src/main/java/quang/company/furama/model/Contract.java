package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class Contract {
    @Id
    private long idContract;
    private String contractDate;
    private String contractExpire;
    private double depositMoney;
    private double totalMoney;

    @OneToOne(mappedBy = "contract")
    ContractDetail contractDetail;

    @ManyToOne()
    @JoinColumn(name = "idEmployee")
    Employee employee;

    @ManyToOne()
    @JoinColumn(name = "idCustomer")
    Customer customer;

    @ManyToOne()
    @JoinColumn(name = "idService")
    Service service;
}
