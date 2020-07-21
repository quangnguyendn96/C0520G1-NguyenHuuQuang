package session5_accessmodifier_staticmothod_staticproperty.thuchanh;

public class Demo {
    private static int check = 10;

    static int demo(){
        return 20;
    }
    static {
        check = 20;
    }

    public static void main(String[] args) {
        System.out.println(Demo.check);
        System.out.println(Demo.demo());
    }
}
