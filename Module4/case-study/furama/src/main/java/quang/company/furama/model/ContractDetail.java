package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

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

    public ContractDetail() {
    }

    public long getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(long idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public ServiceIncluded getServiceIncluded() {
        return serviceIncluded;
    }

    public void setServiceIncluded(ServiceIncluded serviceIncluded) {
        this.serviceIncluded = serviceIncluded;
    }
}
