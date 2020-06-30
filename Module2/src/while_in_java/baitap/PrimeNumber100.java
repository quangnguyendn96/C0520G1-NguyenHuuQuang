package while_in_java.baitap;


public class PrimeNumber100 {

    public static void main(String[] args) {
        boolean check = true;
        for (int number = 2; number <= 100; number++) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) {
                System.out.println(number);
            }
        }
    }
}
