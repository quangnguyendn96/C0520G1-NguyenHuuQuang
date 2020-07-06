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
    String StudentCodyGymClass;

    static {
        System.out.println("111, Hồ Thị Quỳnh Mai, 15/5/1995");
        System.out.println("112, Hồ Thị Trúc Mai, 16/5/1995");
        System.out.println("113, Hồ Thị Ngày Mai, 17/5/1995");
    }

    public void register(StudentCodeGym StudentOfClass) {
        StudentCodyGymClass += StudentOfClass.getId() + ", ";
        StudentCodyGymClass += StudentOfClass.getName() + ", ";
        StudentCodyGymClass += StudentOfClass.getDateOfBirth() + "\n";

    }

    public void graduate(int inputIdDelete,StudentCodeGym studentCodeGym) {
      if(inputIdDelete == studentCodeGym.getId()) {

      }
    }

    public void displayStudent() {
        System.out.println(StudentCodyGymClass);
//        System.out.println(StudentCodeGym.getIndex());
    }

    public static void main(String[] args) {
        StudentCodeGym studentCodeGym1 = new StudentCodeGym(114, "Nguyễn Thị Hồng Nhung", "12/12/1988");
        StudentCodeGym studentCodeGym2 = new StudentCodeGym(115, "Nguyễn Thị Hồng Ly", "13/12/1988");
        StudentCodeGym studentCodeGym3 = new StudentCodeGym(116, "Nguyễn Thị Hồng Thắm", "14/12/1988");
        StudentCodeGym studentCodeGym4 = new StudentCodeGym(117, "Nguyễn Thị Hồng Hiệp", "15/12/1988");
//        StudentCodeGym studentCodeGym5 = new StudentCodeGym(118, "Nguyễn Thị Hồng Pháp", "16/12/1988");
//        StudentCodeGym studentCodeGym6 = new StudentCodeGym(119, "Nguyễn Thị Hồng Vy", "17/12/1988");

//        studentCodeGymClass.register(studentCodeGym5);
//        studentCodeGymClass.register(studentCodeGym6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên ");
        int inputId = scanner.nextInt();
        System.out.println("Nhập tên sinh viên ");
        String inputName = scanner.nextLine();
        scanner.nextInt();
        System.out.println("Nhập ngày tháng năm sinh");
        String inputDayOfBirth = scanner.nextLine();
        scanner.nextInt();
        StudentCodeGym studentCodeGym= new StudentCodeGym(inputId, inputName, inputDayOfBirth);
        StudentCodeGymClass studentCodeGymClass =  new StudentCodeGymClass();
        studentCodeGymClass.register(studentCodeGym1);
        studentCodeGymClass.register(studentCodeGym2);
        studentCodeGymClass.register(studentCodeGym3);
        studentCodeGymClass.register(studentCodeGym4);
        studentCodeGymClass.register(studentCodeGym);
        System.out.println("Nhập mã sinh viên để xoá ");
        int inputIdDelete = scanner.nextInt();
        studentCodeGymClass.displayStudent();
        studentCodeGymClass.graduate(inputIdDelete,studentCodeGym);
    }
}