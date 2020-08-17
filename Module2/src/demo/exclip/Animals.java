package demo.exclip;

import java.util.Collections;

public class Animals extends AllBeing implements Comparable {
    String a;
    int b;
    final double e = 3;
    Long f;

    Animals(int b) {
        this.b = b;
    }

    public void zxc(Long c) {
        this.f = c;
        System.out.println(e);

    }

    Animals(String c) {
        super(c);
//
    }

    ;
    Animals(int b, String c) {
        this(b);


    }

    public void a(int c) {
        System.out.println("a");
    }

    public void a(long c) {
    }

    ;

    public void b(float a, int b, String c) {
        this.a(1);
    }

    public void b(double a) {

    }

    @Override
    public void zxc() {
        super.zxc();
    }

    @Override
    public String toString() {
        return "Animals{" +
                "a='" + a + '\'' +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Animals animals = new Animals("a");
        System.out.println(animals.toString());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}