package models.customer;

import models.Services;

public class Customer implements Comparable<Customer> {
    private String nameCustomer;
    private String dayOfBirth;
    private String gender;
    private int idCustomer;
    private int phoneNumberCustomer;
    private String typeOfCustomer;
    private String addressCustomer;
    private String email;
    Services services;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String nameCustomer, String dayOfBirth, String gender, int idCustomer, int phoneNumberCustomer, String email, String typeOfCustomer, String addressCustomer) {
        this.nameCustomer = nameCustomer;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.idCustomer = idCustomer;
        this.phoneNumberCustomer = phoneNumberCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.addressCustomer = addressCustomer;
        this.email = email;
    }

    Customer() {
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(int phoneNumberCustomer) {
        this.phoneNumberCustomer = phoneNumberCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public int compareTo(Customer customer) {
         return this.getNameCustomer().compareTo(customer.getNameCustomer());
    }

    public String showInfor() {
        return String.format("%20s%30s%20s%20s%20s%20s%20s%20s", nameCustomer, dayOfBirth,gender,idCustomer,phoneNumberCustomer,email,typeOfCustomer,addressCustomer,services);
    }
}
