package list_in_java_collection.exercise.deploy_method_with_arraylist;

public class TestMyList {
    public static class Student{

        private int idStudent;
        private String nameStudent;

        public Student() {
        }
        public Student(int id, String name){
            this.idStudent = id;
            this.nameStudent = name;
        }

        public int getIdStudent() {
            return idStudent;
        }

        public void setIdStudent(int idStudent) {
            this.idStudent = idStudent;
        }

        public String getNameStudent() {
            return nameStudent;
        }

        public void setNameStudent(String nameStudent) {
            this.nameStudent = nameStudent;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Quang" );
        Student student2 = new Student(2, "Nam" );
        Student student3 = new Student(3, "Hà" );
        Student student4 = new Student(4, "Nhung" );
        Student student5 = new Student(5, "An" );
        Student student6 = new Student(6, "Binh" );

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

//        studentMyList.add(student6, 2);
//
//        studentMyList.clear();

        System.out.println(studentMyList.indexOf(student6));
//        MyList = studentMyList.clone();
//        for(int i =0; i < )

        System.out.println(studentMyList.contains(student2));
        for(int i = 0; i < studentMyList.getSize(); i++){
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getIdStudent());
        }
    }

}
