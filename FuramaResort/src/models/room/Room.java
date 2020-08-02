package models.room;

import models.Services;

public class Room extends Services {
    private String freeService;

    public Room() {
    }
    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }


    public Room(String typeService, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String freeService) {
        super(typeService, area, priceRents, maxNumberOfCustomer, typeRents);
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        return String.format("%5s%20s%20s%20s%20s%20s", typeService, area, priceRents, maxNumberOfCustomer, typeRents, freeService);
    }




}
