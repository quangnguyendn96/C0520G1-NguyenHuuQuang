package model;

public class Customer {
    private String idCustomer;
    private String idTypeCustomer;
    private String nameCustomer;
    private String dayOfBirthCustomer;
    private int genderCustomer;
    private String identityCard;
    private String phoneCustomer;
    private String emailCustomer;
    private String addCustomer;

    public Customer(String idCustomer, String idTypeCustomer, String nameCustomer, String dayOfBirthCustomer, int genderCustomer, String identityCard,
                    String phoneCustomer, String emailCustomer, String addCustomer) {
        this.idCustomer = idCustomer;
        this.idTypeCustomer = idTypeCustomer;
        this.nameCustomer = nameCustomer;
        this.dayOfBirthCustomer = dayOfBirthCustomer;
        this.genderCustomer = genderCustomer;
        this.identityCard = identityCard;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.addCustomer = addCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdTypeCustomer() {
        return idTypeCustomer;
    }

    public void setIdTypeCustomer(String idTypeCustomer) {
        this.idTypeCustomer = idTypeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirthCustomer() {
        return dayOfBirthCustomer;
    }

    public void setDayOfBirthCustomer(String dayOfBirthCustomer) {
        this.dayOfBirthCustomer = dayOfBirthCustomer;
    }

    public int getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(int genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddCustomer() {
        return addCustomer;
    }

    public void setAddCustomer(String addCustomer) {
        this.addCustomer = addCustomer;
    }
}
