package accessmodifier_staticmothod_staticproperty.baitap;

import java.util.Scanner;

public class StudentCodeGym {
    private int id;
    private String name;
    private String dateOfBirth;
    private int index = 0;

    StudentCodeGym(int id, String name, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;

    }

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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

class StudentCodeGymClass {

    public static StudentCodeGym[] studentCodeGymClass;

    static {
        studentCodeGymClass = new StudentCodeGym[3];
        studentCodeGymClass[0] = new StudentCodeGym(114, "Nguyễn Thị Hồng Nhung", "12/12/1988");
        studentCodeGymClass[1] = new StudentCodeGym(115, "Nguyễn Thị Hồng Ly", "13/12/1988");
        studentCodeGymClass[2] = new StudentCodeGym(116, "Nguyễn Thị Hồng Thắm", "14/12/1988");
    }

    public void register() {
        StudentCodeGym[] studentCodeGymClassTem = new StudentCodeGym[studentCodeGymClass.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên ");
        int inputId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên sinh viên ");
        String inputName = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh");
        String inputDayOfBirth = scanner.nextLine();


        studentCodeGymClassTem[studentCodeGymClass.length] = new StudentCodeGym(inputId,inputName,inputDayOfBirth);
        for(int i = 0; i <studentCodeGymClass.length; i++) {
            studentCodeGymClassTem[i] = studentCodeGymClass[i];
        }
        studentCodeGymClass = studentCodeGymClassTem;
        displayStudent(studentCodeGymClass);
    }

    public void graduate() {
        int getIndex = 0;
        int inputIdDelete = 0;
        StudentCodeGym[] studentCodeGymClassTem = new StudentCodeGym[studentCodeGymClass.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên để xoá ");
        inputIdDelete = scanner.nextInt();
        for (int i = 0; i < studentCodeGymClass.length; i++) {
            if (inputIdDelete == studentCodeGymClass[i].getId()) {
                getIndex = i;
            }
        }
        for (int j = 0; j < (studentCodeGymClass.length - 1); j++) {
            if (j < getIndex) {
                studentCodeGymClassTem[j] = studentCodeGymClass[j];
            } else {
                studentCodeGymClassTem[j] = studentCodeGymClass[j + 1];
            }
        }
        studentCodeGymClass = studentCodeGymClassTem;
        displayStudent(studentCodeGymClass);
    }


    public void displayStudent(StudentCodeGym[] studentCodeGymClass) {
        for (int i = 0; i < studentCodeGymClass.length; i++) {
            System.out.println("Id student " + studentCodeGymClass[i].getId() + "\n" +
                    "Name student " + studentCodeGymClass[i].getName() + "\n" +
                    "Birthday student " +  studentCodeGymClass[i].getDateOfBirth() + "\n"
            );
        }
    }

    public static void main(String[] args) {
        StudentCodeGymClass studentCodeGymClass = new StudentCodeGymClass();
        studentCodeGymClass.register();


    }
}