package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
@Data
public class ServiceIncluded {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idServiceIncluded;
    private String nameServiceIncluded;
    private double price;
    private int unit;

    @OneToMany(mappedBy = "serviceIncluded", cascade = CascadeType.ALL)
    Collection<ContractDetail> contractDetails;

    public ServiceIncluded() {
    }

    public long getIdServiceIncluded() {
        return idServiceIncluded;
    }

    public void setIdServiceIncluded(long idServiceIncluded) {
        this.idServiceIncluded = idServiceIncluded;
    }

    public String getNameServiceIncluded() {
        return nameServiceIncluded;
    }

    public void setNameServiceIncluded(String nameServiceIncluded) {
        this.nameServiceIncluded = nameServiceIncluded;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public Collection<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Collection<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
