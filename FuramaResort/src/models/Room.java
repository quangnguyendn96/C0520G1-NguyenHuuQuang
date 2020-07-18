package models;

public class Room extends Services {
    private String freeService;

    @Override
    public String showInfor() {
        return "Room{" +
                ", typeSerivce='" + typeSerivce + '\'' +
                ", area=" + area +
                ", priceRents=" + priceRents +
                ", maxNumberOfCustomer=" + maxNumberOfCustomer +
                ", typeRents='" + typeRents + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public Room(String typeSerivce, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String freeService) {
        super(typeSerivce, area, priceRents, maxNumberOfCustomer, typeRents);
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
