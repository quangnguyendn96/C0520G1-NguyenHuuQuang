package quang.company.model;


public class Student {
    private int id;
    private String name;
    private String nameClass;
    private int gender;

    public Student(int id, String name, String nameClass, int gender) {
        this.id = id;
        this.name = name;
        this.nameClass = nameClass;
        this.gender = gender;
    }
    public Student(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
