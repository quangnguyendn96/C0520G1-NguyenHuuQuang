package session6_inheritance_in_java.exercise.point2d;

public class Point3D extends Point2D {
    public float z;

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        float[] arrayInput = new float[3];
        arrayInput[0] = x;
        arrayInput[1] = y;
        arrayInput[2] = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z = " + z +
                ", x = " + x +
                ", y = " + y +
                '}';
    }
}
