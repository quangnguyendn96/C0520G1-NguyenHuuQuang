package while_in_java.baitap;


public class PrimeNumber100 {

    public static void main(String[] args) {
        boolean check;
        for (int number = 2; number <= 100; number++) {
            check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
            }
        }
    }
}
