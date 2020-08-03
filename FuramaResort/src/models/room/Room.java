package models.room;

import models.Services;

public class Room extends Services {
    class FreeService {

    }



    public Room() {
    }
    public Room(String typeService, double area, double priceRents, int maxNumberOfCustomer, String typeRents) {
        super(typeService, area, priceRents, maxNumberOfCustomer, typeRents);

    }
    @Override
    public String showInfor() {
        return String.format("%5s%20s%20s%20s%20s", typeService, area, priceRents, maxNumberOfCustomer, typeRents);
    }




}
