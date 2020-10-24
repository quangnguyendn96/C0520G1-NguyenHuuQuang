package model;

public class Employee {
    private String idEmployee;
    private String nameEmployee;
    private String idPositive;
    private String idDegreeEducation;
    private String idDivision;
    private String dayOfBirth;
    private String identityCardEmployee;
    private double salary;
    private String phoneNumber;
    private String emailEmployee;
    private String addressEmployee;
    private String username;

    public Employee(String idEmployee, String nameEmployee, String idPositive, String idDegreeEducation, String idDivision, String dayOfBirth, String identityCardEmployee, double salary,
                    String phoneNumber, String emailEmployee, String addressEmployee, String username) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.idPositive = idPositive;
        this.idDegreeEducation = idDegreeEducation;
        this.idDivision = idDivision;
        this.dayOfBirth = dayOfBirth;
        this.identityCardEmployee = identityCardEmployee;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.username = username;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getIdPositive() {
        return idPositive;
    }

    public void setIdPositive(String idPositive) {
        this.idPositive = idPositive;
    }

    public String getIdDegreeEducation() {
        return idDegreeEducation;
    }

    public void setIdDegreeEducation(String idDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
    }

    public String getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(String idDivision) {
        this.idDivision = idDivision;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdentityCardEmployee() {
        return identityCardEmployee;
    }

    public void setIdentityCardEmployee(String identityCardEmployee) {
        this.identityCardEmployee = identityCardEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
