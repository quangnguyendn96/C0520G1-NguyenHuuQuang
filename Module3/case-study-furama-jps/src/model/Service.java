package model;

public class Service {
    private int id_service;
    private String  name_service;
    private double area_service   ;
    private int number_floor;
    private int maximum_customer;
    private double  cost_rent;
    private int id_type_service ;
    private int id_type_rent;
    private String  description_other_convenience;
    private double pool_area;
    private String standard_room;

    public Service(int id_service, String name_service, double area_service, int number_floor, int maximum_customer, double cost_rent, int id_type_service, int id_type_rent, String description_other_convenience, double pool_area, String standard_room) {
        this.id_service = id_service;
        this.name_service = name_service;
        this.area_service = area_service;
        this.number_floor = number_floor;
        this.maximum_customer = maximum_customer;
        this.cost_rent = cost_rent;
        this.id_type_service = id_type_service;
        this.id_type_rent = id_type_rent;
        this.description_other_convenience = description_other_convenience;
        this.pool_area = pool_area;
        this.standard_room = standard_room;
    }

    public int getId_service() {
        return id_service;
    }

    public void setId_service(int id_service) {
        this.id_service = id_service;
    }

    public String getName_service() {
        return name_service;
    }

    public void setName_service(String name_service) {
        this.name_service = name_service;
    }

    public double getArea_service() {
        return area_service;
    }

    public void setArea_service(double area_service) {
        this.area_service = area_service;
    }

    public int getNumber_floor() {
        return number_floor;
    }

    public void setNumber_floor(int number_floor) {
        this.number_floor = number_floor;
    }

    public int getMaximum_customer() {
        return maximum_customer;
    }

    public void setMaximum_customer(int maximum_customer) {
        this.maximum_customer = maximum_customer;
    }

    public double getCost_rent() {
        return cost_rent;
    }

    public void setCost_rent(double cost_rent) {
        this.cost_rent = cost_rent;
    }

    public int getId_type_service() {
        return id_type_service;
    }

    public void setId_type_service(int id_type_service) {
        this.id_type_service = id_type_service;
    }

    public int getId_type_rent() {
        return id_type_rent;
    }

    public void setId_type_rent(int id_type_rent) {
        this.id_type_rent = id_type_rent;
    }

    public String getDescription_other_convenience() {
        return description_other_convenience;
    }

    public void setDescription_other_convenience(String description_other_convenience) {
        this.description_other_convenience = description_other_convenience;
    }

    public double getPool_area() {
        return pool_area;
    }

    public void setPool_area(double pool_area) {
        this.pool_area = pool_area;
    }

    public String getStandard_room() {
        return standard_room;
    }

    public void setStandard_room(String standard_room) {
        this.standard_room = standard_room;
    }
}
