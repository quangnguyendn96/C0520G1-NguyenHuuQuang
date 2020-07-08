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

        Geometry[] g = new Geometry[3];
        g[0] = rectangle;
        g[1] = circle;
        g[2] = square;
        Scanner scanner = new Scanner(System.in);
        double inputNumberRandom = scanner.nextDouble();
        for (Geometry i : g) {
           i.resize(inputNumberRandom);
        }
    }
}
