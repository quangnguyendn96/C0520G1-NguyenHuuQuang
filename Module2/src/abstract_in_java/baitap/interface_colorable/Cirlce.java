package abstract_in_java.baitap.interface_colorable;

import abstract_in_java.baitap.resizeable.geometryChild.Geometry;

public class Cirlce extends Geometry implements Colorable {
    private double radius;

    @Override
    public String howToColor() {
        return "Color all full circle";
    }

    Cirlce(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return howToColor() +
                "Area is " + getArea();
    }
}
