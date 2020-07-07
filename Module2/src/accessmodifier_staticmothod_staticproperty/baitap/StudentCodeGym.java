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

    public int getIndex() {
        return index++;
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
    private int index = 3;

    static {
        studentCodeGymClass = new StudentCodeGym[10];
        studentCodeGymClass[0] = new StudentCodeGym(114, "Nguyễn Thị Hồng Nhung", "12/12/1988");
        studentCodeGymClass[1] = new StudentCodeGym(115, "Nguyễn Thị Hồng Ly", "13/12/1988");
        studentCodeGymClass[2] = new StudentCodeGym(116, "Nguyễn Thị Hồng Thắm", "14/12/1988");
    }

    public static void register(StudentCodeGym[] StudentOfClass) {
//        studentCodeGym[index] = StudentOfClass.getId() + ", ";
//        studentCodeGym[index] = StudentOfClass.getName() + ", ";
//        studentCodeGym[index] = StudentOfClass.getDateOfBirth() + "\n";
//        index++;
    }

    public void graduate(int inputIdDelete, StudentCodeGym studentCodeGym) {
        if (inputIdDelete == studentCodeGym.getId()) {

        }
    }

    public void displayStudent() {
//        System.out.println(StudentCodyGymClass);
//        System.out.println(StudentCodeGym.getIndex());
    }

    public static void main(String[] args) {
        StudentCodeGym studentCodeGym4 = new StudentCodeGym(117, "Nguyễn Thị Hồng Hiệp", "15/12/1988");

        Scanner scanner = new Scanner(System.in);

//        StudentCodyGymClass.push(studentCodeGym1);
        System.out.println("Nhập mã sinh viên ");
        int inputId = scanner.nextInt();
        System.out.println("Nhập tên sinh viên ");
        String inputName = scanner.nextLine();
        scanner.nextInt();
        System.out.println("Nhập ngày tháng năm sinh");
        String inputDayOfBirth = scanner.nextLine();
        scanner.nextInt();

        StudentCodeGym studentCodeGym = new StudentCodeGym(inputId, inputName, inputDayOfBirth);
        StudentCodeGymClass studentCodeGymClass = new StudentCodeGymClass();

        System.out.println("Nhập mã sinh viên để xoá ");
        int inputIdDelete = scanner.nextInt();
        studentCodeGymClass.displayStudent();
        studentCodeGymClass.graduate(inputIdDelete, studentCodeGym);
    }
}