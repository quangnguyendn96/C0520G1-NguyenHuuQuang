package session7_abstract_in_java.baitap.resizeable.geometryChild;

import session7_abstract_in_java.baitap.Resizeable;

public class Circle extends Geometry implements Resizeable{
    private double radius = 3.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
         percent = Math.random();
        System.out.println("Area Circle with radius = " + this.getArea() + '\n'+
                "Area Circle after change size is " + percent*this.getArea());
    }
}
