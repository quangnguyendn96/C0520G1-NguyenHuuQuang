package inheritance_in_java.exercise.class_cirlce;

public class Cylinder extends Circle {
    private double height;
    Cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height = height;
    }
    public double volumeCylinder(){
        return areaCircle()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius= " + radius +
                ", color= " + color +
                ", volumeCylinder= " + volumeCylinder()+
                '}';
    }
}
