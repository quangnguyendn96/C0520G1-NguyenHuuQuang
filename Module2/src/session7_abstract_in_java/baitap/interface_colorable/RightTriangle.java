package session7_abstract_in_java.baitap.interface_colorable;

import session7_abstract_in_java.baitap.resizeable.geometryChild.Geometry;

public class RightTriangle extends Geometry implements Colorable {
    double theFirstSide;
    double theSecondSide;


    @Override
    public String howToColor() {
        return "Color all three sides";
    }

    RightTriangle(double theFirstSide, double theSecondSide) {
        this.theFirstSide = theFirstSide;
        this.theSecondSide = theSecondSide;

    }

    public double getArea() {
        return (theSecondSide * theFirstSide) / 2;
    }

    @Override
    public String toString() {
        return howToColor() +
                "Area is " + this.getArea();
    }
}
