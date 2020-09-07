package model.employee;

public class Employee {
    private int idEmployee;
    private String nameEmployee;
    private int idPositive;
    private int idDegreeEducation;
    private int idDivision;
    private String dayOfBirth;
    private String identityCardEmployee;
    private double salary;
    private String phoneNumber;
    private String emailEmployee;
    private String addressEmployee;
    private String username;

    public Employee(int idEmployee, String nameEmployee, int idPositive, int idDegreeEducation, int idDivision, String dayOfBirth, String identityCardEmployee, double salary,
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

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getIdPositive() {
        return idPositive;
    }

    public void setIdPositive(int idPositive) {
        this.idPositive = idPositive;
    }

    public int getIdDegreeEducation() {
        return idDegreeEducation;
    }

    public void setIdDegreeEducation(int idDegreeEducation) {
        this.idDegreeEducation = idDegreeEducation;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
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
