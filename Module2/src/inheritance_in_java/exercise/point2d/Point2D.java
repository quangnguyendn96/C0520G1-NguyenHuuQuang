package inheritance_in_java.exercise.point2d;

public class Point2D {
    public float x;
    public float y;

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        float[] arrayInput = new float[2];
        arrayInput[0] = x;
        arrayInput[1] = y;
    }

//    public float getXY() {
//        return
//    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

