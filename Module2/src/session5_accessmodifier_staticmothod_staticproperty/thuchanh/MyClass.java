package session5_accessmodifier_staticmothod_staticproperty.thuchanh;


    class MyClass {
        static int []x = {1,2};

//       void method(int[] x) {
//       x[0] = x[0];
//       x[1] = x[1];
//       }

        public static void main(String[] args) {
            MyClass o = new MyClass();
//            int[] x = {1, 1};
            System.out.printf("x=%d, y=%d", x[0], x[1]);
        }
    }
