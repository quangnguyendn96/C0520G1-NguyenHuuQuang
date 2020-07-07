package abstract_in_java.baitap.interface_colorable;

import abstract_in_java.baitap.resizeable.geometryChild.Geometry;

public class Square extends Geometry implements Colorable {
    private double side;
    @Override
    public String howToColor() {
        return "Color all four sides";
    }
    Square(double side){
        this.side = side;
    }
    public double getArea(){
        return this.side*this.side;
    }
    @Override
    public String toString() {
        return howToColor() +
                "Area is " + getArea();
    }
}
