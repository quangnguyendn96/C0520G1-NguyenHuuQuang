package session4_class_in_java.baitap;

import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }

    public long getElepSedTime() {
        return endTime - startTime;

    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the ");
        int inputLength = scanner.nextInt();

        int arrayInput[] = new int[inputLength];
        for (int i = 0; i < inputLength; i++) {
            arrayInput[i] = (int) (Math.random() * inputLength);
        }
        watch.setStartTime();

        for (int n = 0; n < inputLength; n++) {
            int min = arrayInput[n];
            int index = -1;
            int temp;
            for (int i = n; i < inputLength; i++) {
                if (min > arrayInput[i]) {
                    min = arrayInput[i];
                    index = i;
                }
                if (index != -1) {
                    temp = arrayInput[n];
                    arrayInput[n] = arrayInput[index];
                    arrayInput[index] = temp;
                }
            }
        }
            watch.setEndTime();
            System.out.println("Time of selection sort: " + (watch.getElepSedTime()) + " milliseconds.");
//        System.out.print("After selection sort: ");
//        for(int x : numbers) System.out.print(x + "  ");
    }
}
