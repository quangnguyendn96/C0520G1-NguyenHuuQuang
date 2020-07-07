package inheritance_in_java.exercise.class_point_and_moveable;

import java.util.Scanner;

public class TestMovablePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        float x = scanner.nextInt();
        System.out.println("Enter y: ");
        float y = scanner.nextInt();
        System.out.println("Enter ySpeed: ");
        float xSpeed = scanner.nextInt();
        System.out.println("Enter ySpeed: ");
        float ySpeed = scanner.nextInt();

        MovablePoint movablePoint = new MovablePoint(x,y,xSpeed,ySpeed);

        System.out.println(movablePoint.move());
    }
}
