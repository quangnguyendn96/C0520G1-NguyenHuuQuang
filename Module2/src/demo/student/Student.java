package demo.student;

public class Student {
    String name;
    String nameClass;
    int age;
    String gender;
    String idStudent;

    public Student(String name, String nameClass, int age, String gender, String idStudent) {
        this.name = name;
        this.nameClass = nameClass;
        this.age = age;
        this.gender = gender;
        this.idStudent = idStudent;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + name + '\'' +
                ", nameClass= " + nameClass + '\'' +
                ", age= " + age +
                ", gender= " + gender + '\'' +
                ", idStudent= " + idStudent + '\'' +
                '}';
    }
}
