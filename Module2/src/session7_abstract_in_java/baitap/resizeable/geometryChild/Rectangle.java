package session7_abstract_in_java.baitap.resizeable.geometryChild;

import session7_abstract_in_java.baitap.Resizeable;

public class Rectangle extends Geometry implements Resizeable{
    private double width = 1.0;
    private double length = 3.0;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width= " + getWidth()
                + " and length= " + getLength()
                + ", which is a subclass of "
                + super.toString()
                + ", Area of rectangle " + this.getArea()
                + ", area after change size ";
    }

    @Override
    public void resize(double percent) {
        percent = Math.random();
        System.out.println("Area Rectangle with width and length =" + this.getArea() + "\n" +
                "Area Rectangle after adjust size = " + percent * this.getArea());
    }
}
