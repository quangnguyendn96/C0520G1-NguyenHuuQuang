package class_in_java.baitap;
import java.time.LocalTime;
public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public void start() {
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
    public void stop(){}
//    public double getElepSedTime() {
//        return;
//    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
    }
}
