package session7_abstract_in_java.baitap;

import session7_abstract_in_java.baitap.resizeable.geometryChild.Circle;
import session7_abstract_in_java.baitap.resizeable.geometryChild.Geometry;
import session7_abstract_in_java.baitap.resizeable.geometryChild.Rectangle;
import session7_abstract_in_java.baitap.resizeable.geometryChild.Square;

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

        for (Geometry geometry : g) {
           if(geometry instanceof Rectangle){
               Rectangle rectangle1 = (Rectangle)geometry;
               rectangle1.resize(inputNumberRandom);
           }
           else if (geometry instanceof Circle){
               Circle circle1 = (Circle)geometry;
               circle1.resize(inputNumberRandom);
           }
           else {
               Square square1 = (Square)geometry;
               square1.resize(inputNumberRandom);
           }
        }
    }
}
