package abstract_in_java.baitap.resizeable.geometryChild;

import abstract_in_java.baitap.Resizeable;

public class Geometry implements Resizeable {
    private String color = "green";


    public Geometry() {
    }

    public Geometry(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }

    @Override
    public void resize(double percent) {
        percent = Math.random();
    }

}

