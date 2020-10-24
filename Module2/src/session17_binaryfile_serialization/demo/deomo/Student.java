package session17_binaryfile_serialization.demo.deomo;


import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    public static String sex = "Men";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

