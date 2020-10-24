package session1_introduction_to_java;

import java.util.Scanner;

public class TransMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tiền USD");
        double inputMoney = scanner.nextDouble();
        System.out.println("Tiền sau khi chuyển đổi là " + (inputMoney * 23000) + " VND");
    }
}
