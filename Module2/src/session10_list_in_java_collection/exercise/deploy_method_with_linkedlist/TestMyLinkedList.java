package session10_list_in_java_collection.exercise.deploy_method_with_linkedlist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        class Student {
            private int idStudent;
            private String name;

            public Student(int idStudent, String name) {
                this.idStudent = idStudent;
                this.name = name;
            }

            public int getIdStudent() {
                return idStudent;
            }

            public void setIdStudent(int idStudent) {
                this.idStudent = idStudent;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Nam");
        Student student2 = new Student(2, "An");
        Student student3 = new Student(3, "Mai");
        Student student4 = new Student(4, "Khánh");
        Student student5 = new Student(5, "Ngọc");

        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);

//        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
//
//        for(int i =0; i < cloneLinkedList.getSize(); i++){
//            Student student = (Student) cloneLinkedList.get(i);
//            System.out.println(student.getName());
//        }

//        System.out.println(myLinkedList.constrains(2));
        myLinkedList.remove(0);


        for (int i = 0; i < myLinkedList.getSize(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println("Name :" +student.getIdStudent() +", Age :" +student.getName());
        }
    }
}
