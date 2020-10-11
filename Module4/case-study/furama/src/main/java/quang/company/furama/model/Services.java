package quang.company.furama.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table

public class Services {
    @Id
    private long idService;
    private String nameService;
    private double areaService;
    private String numberFloor;
    private String maximumCustomer;
    private double costRent;
    private String descriptionOtherConvenience;
    private double poolArea;
    private String standardRoom;

    @ManyToOne()
    @JoinColumn(name = "idTypeRent")
    TypeRent typeRent;

    @ManyToOne()
    @JoinColumn(name = "idTypeService")
    TypeService typeService;

    @OneToMany(mappedBy = "services", cascade = CascadeType.ALL)
    Collection<Contract> contracts;

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
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

    public TypeRent getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(TypeRent typeRent) {
        this.typeRent = typeRent;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public Collection<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Collection<Contract> contracts) {
        this.contracts = contracts;
    }
}
