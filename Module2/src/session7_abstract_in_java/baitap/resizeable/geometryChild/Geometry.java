package session7_abstract_in_java.baitap.resizeable.geometryChild;

public class Geometry {
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

}

