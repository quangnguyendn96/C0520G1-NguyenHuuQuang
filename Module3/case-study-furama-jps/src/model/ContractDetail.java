package model;

public class ContractDetail {
    private int idContractDetail;
    private int idContract;
    private int id_service_included;
    private double amount;

    public ContractDetail(int idContractDetail, int idContract, int id_service_included, double amount) {
        this.idContractDetail = idContractDetail;
        this.idContract = idContract;
        this.id_service_included = id_service_included;
        this.amount = amount;
    }

    public int getIdContractDetail() {
        return idContractDetail;
    }

    public void setIdContractDetail(int idContractDetail) {
        this.idContractDetail = idContractDetail;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getId_service_included() {
        return id_service_included;
    }

    public void setId_service_included(int id_service_included) {
        this.id_service_included = id_service_included;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
