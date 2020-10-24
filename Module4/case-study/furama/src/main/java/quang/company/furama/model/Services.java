package quang.company.furama.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import quang.company.furama.config.CheckValidate;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Collection;

@Entity
@Table

public class Services implements Validator {
    @Id

    private String idService;
    @NotEmpty
    private String nameService;

    @Min(0)
    private double areaService;

    @Pattern(regexp = "^([1-9]|([1-9][\\d]+))$",message = "Not right")
    private String numberFloor;

    @Pattern(regexp = "^([1-9]|([1-9][\\d]+))$",message = "Not right")
    private String maximumCustomer;

    @Min(0)
    private double costRent;

    @NotEmpty
    private String descriptionOtherConvenience;

//    @Pattern(regexp ="^[1-9][0-9]*$",message = "Must be > 0")
    private double poolArea;
    @NotEmpty
    private String standardRoom;

    @ManyToOne()
    @JoinColumn(name = "idTypeRent")
    TypeRent typeRent;

    @ManyToOne()
    @JoinColumn(name = "idTypeService")
    TypeService typeService;

    @OneToMany(mappedBy = "services", cascade = CascadeType.ALL)
    Collection<Contract> contracts;

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

    @Override
    public boolean supports(Class<?> clazz) {
        return Contract.class.isAssignableFrom(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {
        Services services = (Services) target;
      `  if(!CheckValidate.checkIdService(services.getIdService())){
            errors.rejectValue("idService", "idService.checkInput");
        }`
        if(services.getNameService().isEmpty()){
            errors.rejectValue("nameService","nameService.checkInput");
        }
    }
}
