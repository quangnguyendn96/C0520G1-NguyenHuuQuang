package session3_array_and_method.thuchanh;

public class Demo {
    public static void main(String[] args) {
        int[] a = {50, 100};
        m(a);
        System.out.println(a[0]);
    }

    static void m(int[] x) {
        x[0] = 200;
    }
}