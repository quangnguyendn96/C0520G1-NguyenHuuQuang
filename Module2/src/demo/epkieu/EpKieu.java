package demo.epkieu;
import java.util.Scanner;

public class EpKieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check=true;
        do {
            String scn = scanner.nextLine();
            switch (scn){
                case "1" :
                    System.out.println("1");
                    break;
                case "2":
                    check = true;
            }
        }
        while (check);
    }
}
