package model;

public class Service {
    private int idService;
    private String  nameService;
    private double areaService   ;
    private int numberFloor;
    private int maximumCustomer;
    private double costRent;
    private int idTypeService ;
    private int idTypeRent;
    private String  descriptionOtherConvenience;
    private double poolArea;
    private String standardRoom;

    public Service(int idService, String nameService, double areaService, int numberFloor, int maximumCustomer,
                   double costRent, int idTypeService, int idTypeRent, String descriptionOtherConvenience, double poolArea, String standardRoom) {
        this.idService = idService;
        this.nameService = nameService;
        this.areaService = areaService;
        this.numberFloor = numberFloor;
        this.maximumCustomer = maximumCustomer;
        this.costRent = costRent;
        this.idTypeService = idTypeService;
        this.idTypeRent = idTypeRent;
        this.descriptionOtherConvenience = descriptionOtherConvenience;
        this.poolArea = poolArea;
        this.standardRoom = standardRoom;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaService() {
        return areaService;
    }

    public void setAreaService(double areaService) {
        this.areaService = areaService;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    public int getMaximumCustomer() {
        return maximumCustomer;
    }

    public void setMaximumCustomer(int maximumCustomer) {
        this.maximumCustomer = maximumCustomer;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(int idTypeService) {
        this.idTypeService = idTypeService;
    }

    public int getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(int idTypeRent) {
        this.idTypeRent = idTypeRent;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }
}
