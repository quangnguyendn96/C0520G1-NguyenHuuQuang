package models.house;

import models.Services;

public class House extends Services {
    private String standardRoom;
    private String convenience;
    private int numberFloor;


    public House() {
    }

    public House(String typeService, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String standardRoom, String convenience, int numberFloor) {
        super(typeService, area, priceRents, maxNumberOfCustomer, typeRents);
        this.standardRoom = standardRoom;
        this.convenience = convenience;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getConvenience() {
        return convenience;
    }

    public void setConvenience(String convenience) {
        this.convenience = convenience;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfor() {
        return String.format("%5s%20s%20s%20s%20s%20s%20s%20s", typeService,area,priceRents,maxNumberOfCustomer,typeRents,standardRoom,convenience,numberFloor);
    }


}
