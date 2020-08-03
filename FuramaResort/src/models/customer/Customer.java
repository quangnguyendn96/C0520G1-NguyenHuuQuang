package models.customer;

import models.Services;

import java.util.Collections;

public class Customer {
    private String nameCustomer;
    private String dayOfBirth;
    private String gender;
    private String idCustomer;
    private String phoneNumberCustomer;
    private String typeOfCustomer;
    private String addressCustomer;
    private String email;
    Services services;


    public Customer(String nameCustomer, String dayOfBirth, String gender, String idCustomer, String phoneNumberCustomer,
                    String email, String typeOfCustomer, String addressCustomer) {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getPhoneNumberCustomer() {
        return phoneNumberCustomer;
    }

    public void setPhoneNumberCustomer(String phoneNumberCustomer) {
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

    public int getYear() {
        return Integer.parseInt(dayOfBirth.substring(6, 10));
    }

    public String getLastName() {
        return nameCustomer.substring(nameCustomer.lastIndexOf(" "), nameCustomer.length());
    }

    public String showInfor() {
        return String.format("%-18s%-20s%-10s%-20s%-20s%-30s%-20s%-20s", nameCustomer, dayOfBirth, gender, idCustomer, phoneNumberCustomer,
                email, typeOfCustomer, addressCustomer);
    }

}
