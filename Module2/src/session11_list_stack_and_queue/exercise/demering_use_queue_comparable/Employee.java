package session11_list_stack_and_queue.exercise.demering_use_queue;

public class Employee {
    private String name;
    private String gender;
    private String dayOfBirth;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Employee(String name, String gender, String dayOfBirth, int age) {
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.age = age;
    }

    public int getYear() {
        return Integer.parseInt((getDayOfBirth().substring(6, 10)));
    }
    public int getDay() {
        return Integer.parseInt((getDayOfBirth().substring(0, 2)));
    }
    public int getMonth() {
        return Integer.parseInt((getDayOfBirth().substring(3, 5)));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name = " + name + '\'' +
                ", gender = " + gender + '\'' +
                ", dayOfBirth = " + dayOfBirth + '\'' +
                ", age = " + age +
                '}';
    }
}
