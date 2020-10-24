package session4_class_in_java.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return this.b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double x1 = (-this.b + Math.sqrt(this.getDiscriminant()))/ (2 * this.a);
        return x1;
    }
    public double getRoot2() {
        double x2 = (-this.b - Math.sqrt(this.getDiscriminant()))/ (2 * this.a);
        return x2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập ba số a, b ,c : ");
        double numberA = input.nextDouble();
        double numberB = input.nextDouble();
        double numberC = input.nextDouble();

        QuadraticEquation TakeTheParameter = new QuadraticEquation(numberA, numberB, numberC);

        if (TakeTheParameter.getDiscriminant() > 0) {
            System.out.println("Nghiệm thứ nhất là " +TakeTheParameter.getRoot1());
            System.out.println("Nghiệm thứ hai là " + TakeTheParameter.getRoot2());
        }
        else if (TakeTheParameter.getDiscriminant() == 0) {
            System.out.println("Phương trình có một nghiệm là " + TakeTheParameter.getRoot1());
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
