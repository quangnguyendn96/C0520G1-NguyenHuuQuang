package model;

public class Student {
    private String id;
    private String name;
    private String className;
    private String gender;
    private String idCard;
    private String dayOfBirth;
    private String phoneNumber;

    public Student(String id, String name, String className, String gender, String idCard, String dayOfBirth, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.gender = gender;
        this.idCard = idCard;
        this.dayOfBirth = dayOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
