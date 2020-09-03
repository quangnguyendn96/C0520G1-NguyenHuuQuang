package model;

public class Employee {
    private int id_employee;
    private String name_employee;
    private int id_positive;
    private int id_degree_education;
    private int id_division;
    private String day_of_birth ;
    private String identity_card_employee;
    private double salary;
    private String phone_number;
    private String email_employee ;
    private String address_employee ;
    private String username;

    public Employee(int id_employee, String name_employee, int id_positive, int id_degree_education, int id_division, String day_of_birth, String identity_card_employee, double salary,
                    String phone_number, String email_employee, String address_employee, String username) {
        this.id_employee = id_employee;
        this.name_employee = name_employee;
        this.id_positive = id_positive;
        this.id_degree_education = id_degree_education;
        this.id_division = id_division;
        this.day_of_birth = day_of_birth;
        this.identity_card_employee = identity_card_employee;
        this.salary = salary;
        this.phone_number = phone_number;
        this.email_employee = email_employee;
        this.address_employee = address_employee;
        this.username = username;
    }

    public int getId_employee() {
        return id_employee;
    }

    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    public String getName_employee() {
        return name_employee;
    }

    public void setName_employee(String name_employee) {
        this.name_employee = name_employee;
    }

    public int getId_positive() {
        return id_positive;
    }

    public void setId_positive(int id_positive) {
        this.id_positive = id_positive;
    }

    public int getId_degree_education() {
        return id_degree_education;
    }

    public void setId_degree_education(int id_degree_education) {
        this.id_degree_education = id_degree_education;
    }

    public int getId_division() {
        return id_division;
    }

    public void setId_division(int id_division) {
        this.id_division = id_division;
    }

    public String getDay_of_birth() {
        return day_of_birth;
    }

    public void setDay_of_birth(String day_of_birth) {
        this.day_of_birth = day_of_birth;
    }

    public String getIdentity_card_employee() {
        return identity_card_employee;
    }

    public void setIdentity_card_employee(String identity_card_employee) {
        this.identity_card_employee = identity_card_employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_employee() {
        return email_employee;
    }

    public void setEmail_employee(String email_employee) {
        this.email_employee = email_employee;
    }

    public String getAddress_employee() {
        return address_employee;
    }

    public void setAddress_employee(String address_employee) {
        this.address_employee = address_employee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
