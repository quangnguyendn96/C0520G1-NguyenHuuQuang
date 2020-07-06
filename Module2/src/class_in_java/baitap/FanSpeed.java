package class_in_java.baitap;

public class FanSpeed {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;
    private int speed;
    private boolean switchFan;
    private double radius;
    private String color;
    private String statusSpeed;

    FanSpeed(int speed, boolean switchFan, double radius, String color) {
        this.speed = speed;
        this.switchFan = switchFan;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwitchFan() {
        return switchFan;
    }

    public void setSwitchFan(boolean switchFan) {
        this.switchFan = switchFan;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFast() {
        return fast;
    }

    public int getMedium() {
        return medium;
    }

    public int getSlow() {
        return slow;
    }

    public String speedFan() {
        if (this.speed == 1) {
            statusSpeed = "Slow";
        } else if (this.speed == 2) {
            statusSpeed = "Medium";
        } else if (this.speed == 3) {
            statusSpeed ="Fast";
        }
        return statusSpeed;
    }

    @Override
    public String toString() {
        if (this.isSwitchFan()) {
            return "FanSpeed{" + "\n" +
                    "Speed= " + speedFan() + "," + "\n"+
                    "SwitchFan = Fan is running" + "," + "\n"+
                    "Radius= " + radius + "," + "\n"+
                    "Color= " + color  + "," + "\n"+
                    '}';
        } else {
            return "FanSpeed{" + "\n" +
                    "SwitchFan =  Fan is stopped" + "," + "\n"+
                    "Radius = " + radius +  "," + "\n"+
                    "Color= " + color + "," + "\n"+
                    '}';
        }
    }

    public static void main(String[] args) {

        FanSpeed fan1 = new FanSpeed(1, true, 10, "yellow");
        FanSpeed fan2 = new FanSpeed(2, false, 5, "red");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
