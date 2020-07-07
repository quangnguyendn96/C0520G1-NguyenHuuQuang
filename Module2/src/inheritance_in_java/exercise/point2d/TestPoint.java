package inheritance_in_java.exercise.point2d;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x :");
        float inputX = scanner.nextFloat();
        System.out.println("Enter y :");
        float inputY = scanner.nextFloat();
        System.out.println("Enter z :");
        float inputZ = scanner.nextFloat();
   Point2D point2D = new Point2D(inputX, inputY);
   Point3D point3D = new Point3D(inputX, inputY, inputZ);

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }

}
