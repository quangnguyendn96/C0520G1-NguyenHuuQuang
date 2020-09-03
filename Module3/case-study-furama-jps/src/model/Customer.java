package model;

public class Customer {
    private int id_customer;
    private int id_type_customer;
    private String name_customer;
    private String day_of_birth_customer;
    private String gender_customer;
    private String identity_card;
    private String phone_customer;
    private String email_customer;
    private String add_customer;

    public Customer(int id_customer, int id_type_customer, String name_customer, String day_of_birth_customer, String gender_customer, String identity_card,
                    String phone_customer, String email_customer, String add_customer) {
        this.id_customer = id_customer;
        this.id_type_customer = id_type_customer;
        this.name_customer = name_customer;
        this.day_of_birth_customer = day_of_birth_customer;
        this.gender_customer = gender_customer;
        this.identity_card = identity_card;
        this.phone_customer = phone_customer;
        this.email_customer = email_customer;
        this.add_customer = add_customer;
    }

    public int getId_customer() {
        return id_customer;
    }

    public void setId_customer(int id_customer) {
        this.id_customer = id_customer;
    }

    public int getId_type_customer() {
        return id_type_customer;
    }

    public void setId_type_customer(int id_type_customer) {
        this.id_type_customer = id_type_customer;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getDay_of_birth_customer() {
        return day_of_birth_customer;
    }

    public void setDay_of_birth_customer(String day_of_birth_customer) {
        this.day_of_birth_customer = day_of_birth_customer;
    }

    public String getGender_customer() {
        return gender_customer;
    }

    public void setGender_customer(String gender_customer) {
        this.gender_customer = gender_customer;
    }

    public String getIdentity_card() {
        return identity_card;
    }

    public void setIdentity_card(String identity_card) {
        this.identity_card = identity_card;
    }

    public String getPhone_customer() {
        return phone_customer;
    }

    public void setPhone_customer(String phone_customer) {
        this.phone_customer = phone_customer;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    public String getAdd_customer() {
        return add_customer;
    }

    public void setAdd_customer(String add_customer) {
        this.add_customer = add_customer;
    }
}
