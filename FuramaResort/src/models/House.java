package models;

public class House extends Services {
    private String standardRoom;
    private String convenience;
    private int numberFloor;

    @Override
    public String showInfor() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", convenience='" + convenience + '\'' +
                ", numberFloor=" + numberFloor +
                ", typeSerivce='" + typeSerivce + '\'' +
                ", area=" + area +
                ", priceRents=" + priceRents +
                ", maxNumberOfCustomer=" + maxNumberOfCustomer +
                ", typeRents='" + typeRents + '\'' +
                '}';
    }


    public House(String typeSerivce, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String standardRoom, String convenience, int numberFloor) {
        super(typeSerivce, area, priceRents, maxNumberOfCustomer, typeRents);
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
}
