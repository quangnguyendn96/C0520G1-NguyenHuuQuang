package session7_abstract_in_java.baitap.resizeable.geometryChild;

import session7_abstract_in_java.baitap.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side = 3;

    public Square() {
    }

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()
                + ", Area Rectangle is " + this.getArea();

    }

    @Override
    public void resize(double percent) {
        percent = Math.random();
        System.out.println("Area Square = " + this.getArea() + "\n" +
                "Area Square after adjust size = " + percent * getArea());
    }
}
