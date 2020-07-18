package models;

public abstract class Services {
    String typeSerivce;
    double area;
    double priceRents;
    int maxNumberOfCustomer;
    String typeRents;

    public abstract String showInfor();

    public Services(String typeSerivce, double area, double priceRents, int maxNumberOfCustomer, String typeRents) {
        this.typeSerivce = typeSerivce;
        this.area = area;
        this.priceRents = priceRents;
        this.maxNumberOfCustomer = maxNumberOfCustomer;
        this.typeRents = typeRents;
    }

    public String getTypeSerivce() {
        return typeSerivce;
    }

    public void setTypeSerivce(String typeSerivce) {
        this.typeSerivce = typeSerivce;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPriceRents() {
        return priceRents;
    }

    public void setPriceRents(double priceRents) {
        this.priceRents = priceRents;
    }

    public int getMaxNumberOfCustomer() {
        return maxNumberOfCustomer;
    }

    public void setMaxNumberOfCustomer(int maxNumberOfCustomer) {
        this.maxNumberOfCustomer = maxNumberOfCustomer;
    }

    public String getTypeRents() {
        return typeRents;
    }

    public void setTypeRents(String typeRents) {
        this.typeRents = typeRents;
    }
}
