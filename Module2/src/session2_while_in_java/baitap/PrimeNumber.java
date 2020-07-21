package session2_while_in_java.baitap;

public class PrimeNumber {

    public static void main(String[] args) {
        boolean check = true;
        int count = 1;
        for (int number = 2; count <= 20; number++) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }

                check = true;
            }
            if (check) {
                System.out.println(number);
                count++;
            }

        }
    }
}
