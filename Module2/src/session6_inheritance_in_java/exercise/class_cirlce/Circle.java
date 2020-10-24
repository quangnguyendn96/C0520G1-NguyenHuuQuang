package session6_inheritance_in_java.exercise.class_cirlce;

public class Circle {
    double radius;
    public String color;
    final double pi = 3.14;

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double areaCircle(){
         return radius*radius*this.pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", areaCircle=" + areaCircle() +
                '}';
    }
}
