package session5_accessmodifier_staticmothod_staticproperty.baitap;

 class Student8 {
        int rollno;
        String name;
        static String college = "BachKhoa";
        public static double age = 20;

        Student8(int r, String n) {
            this.rollno = r;
            this.name = n;

        }
        public void setAge(int age) {
            this.age = age;
        }
        public double getAge() {
            return age;
        }
        static int demo(){
            return 21;
        }
        public int getDemo(){
            return this.demo();
        }



        void display() {
            System.out.println(this.rollno + " " + this.name + " " + this.college + " " + getAge());
        }
     public static void main(String args[]) {
         Student8 s1 = new Student8(111, "Hoang");
         Student8 s2 = new Student8(222, "Thanh");
         Student8 s3 = new Student8(222, "Thanh");
         System.out.println(Student8.age);
//         s1.display();
//         s3.display();
//         s2.display();
//         s2.getDemo();
         System.out.println(s2.getDemo());
     }
        }
