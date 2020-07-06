package accessmodifier_staticmothod_staticproperty.baitap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {
    }

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class TestCircle {
    public static void main(String[] args) {
//        Circle Circle = new Circle();
        Circle Circle1 = new Circle(2.0, "yellow");
        Circle Circle2 = new Circle();
        Circle2.setColor("black");
//        System.out.println(Circle.getRadius() + Circle.getColor());
        System.out.println(Circle1.getRadius() + Circle1.getColor());
        System.out.println(Circle2.getColor());

    }
}
