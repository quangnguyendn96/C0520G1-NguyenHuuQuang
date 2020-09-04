package model;

public class Contract {
     private int idContract;
     private int idEmployee;
     private int idCustomer;
     private int idService ;
     private String contractDate;
     private String contractExpire;
     private double depositMoney;
     private double totalMoney;

    public Contract(int idContract, int idEmployee, int idCustomer, int idService,
                    String contractDate, String contractExpire, double depositMoney, double totalMoney) {
        this.idContract = idContract;
        this.idEmployee = idEmployee;
        this.idCustomer = idCustomer;
        this.idService = idService;
        this.contractDate = contractDate;
        this.contractExpire = contractExpire;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
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
}
