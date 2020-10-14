package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table

public class Contract {
    @Id
    private long idContract;
    private String contractDate;
    private String contractExpire;
    private double depositMoney;
    private double totalMoney;

    @OneToOne(mappedBy = "contract",cascade = CascadeType.ALL)
    ContractDetail contractDetail;

    @ManyToOne()
    @JoinColumn(name = "idEmployee")
    Employee employee;

    @ManyToOne()
    @JoinColumn(name = "idCustomer")
    Customer customer;

    @ManyToOne()
    @JoinColumn(name = "idService")
    Services services;

    public Contract() {
    }

    public long getIdContract() {
        return idContract;
    }

    public void setIdContract(long idContract) {
        this.idContract = idContract;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractExpire() {
        return contractExpire;
    }

    public void setContractExpire(String contractExpire) {
        this.contractExpire = contractExpire;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public ContractDetail getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(ContractDetail contractDetail) {
        this.contractDetail = contractDetail;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}