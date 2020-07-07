package abstract_in_java.baitap.interface_colorable;

public class TestGeometry {
    public static void main(String[] args) {
        Cirlce cirlce = new Cirlce(3);
        RightTriangle rightTriangle = new RightTriangle(2,3);
        Square square = new Square(7);

        System.out.println(cirlce.toString());
        System.out.println(rightTriangle.toString());
        System.out.println(square.toString());
    }
}
