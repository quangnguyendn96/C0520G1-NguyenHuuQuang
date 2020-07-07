package abstract_in_java.baitap;

import abstract_in_java.baitap.resizeable.geometryChild.Circle;
import abstract_in_java.baitap.resizeable.geometryChild.Geometry;
import abstract_in_java.baitap.resizeable.geometryChild.Rectangle;
import abstract_in_java.baitap.resizeable.geometryChild.Square;

import java.util.Scanner;

public class TestInterfaceResizeable {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        Scanner scanner = new Scanner(System.in);
        double inputNumberRandom = scanner.nextDouble();
        rectangle.resize(inputNumberRandom);
        circle.resize(inputNumberRandom);
        square.resize(inputNumberRandom);

    }
}
