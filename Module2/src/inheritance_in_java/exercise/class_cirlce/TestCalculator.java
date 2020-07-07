package inheritance_in_java.exercise.class_cirlce;

import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();

        System.out.println("Enter the color");
        String color = input.nextLine();
        input.nextLine();
        System.out.println("Enter the height of Cylinder");
        double height = input.nextDouble();

        Circle circle = new Circle(radius, color);
        Cylinder cylinder = new Cylinder(radius, color, height);
//        System.out.println(circle.toString());
//        System.out.println(cylinder.toString());
        Circle circle1 = new Cylinder(5,"black", 3 );
        System.out.println(((Cylinder)circle1).toString());
    }
}
