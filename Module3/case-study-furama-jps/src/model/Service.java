package model;

public class Service {
    private String idService;
    private String  nameService;
    private double areaService   ;
    private String numberFloor;
    private String maximumCustomer;
    private double costRent;
    private String idTypeService ;
    private String idTypeRent;
    private String  descriptionOtherConvenience;
    private double poolArea;
    private String standardRoom;

    public Service(String idService, String nameService, double areaService, String numberFloor, String maximumCustomer, double costRent, String idTypeService, String idTypeRent, String descriptionOtherConvenience, double poolArea, String standardRoom) {
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

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
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

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    public String getMaximumCustomer() {
        return maximumCustomer;
    }

    public void setMaximumCustomer(String maximumCustomer) {
        this.maximumCustomer = maximumCustomer;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public String getIdTypeService() {
        return idTypeService;
    }

    public void setIdTypeService(String idTypeService) {
        this.idTypeService = idTypeService;
    }

    public String getIdTypeRent() {
        return idTypeRent;
    }

    public void setIdTypeRent(String idTypeRent) {
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
