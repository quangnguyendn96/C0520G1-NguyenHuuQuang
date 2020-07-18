package models;

public class Villa extends Services {
    private String standardRoom;
    private String convenience;
    private double areaSwimming;
    private int numberFloor;

    public Villa(String typeSerivce, double area, double priceRents, int maxNumberOfCustomer, String typeRents, String standardRoom, String convenience, double areaSwimming, int numberFloor) {
        super(typeSerivce, area, priceRents, maxNumberOfCustomer, typeRents);
        this.standardRoom = standardRoom;
        this.areaSwimming = areaSwimming;
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

    public double getAreaSwimming() {
        return areaSwimming;
    }

    public void setAreaSwimming(double areaSwimming) {
        this.areaSwimming = areaSwimming;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String showInfor() {

        return "Villa {" + "typeSerivce = " + typeSerivce + '\'' +
                ", area = " + area +
                ", priceRents = " + priceRents +
                ", maxNumberOfCustomer = " + maxNumberOfCustomer +
                ", typeRents = " + typeRents + '\'' +
                "standardRoom='" + standardRoom + '\'' +
                ", convenience='" + convenience + '\'' +
                ", areaSwimming=" + areaSwimming +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
