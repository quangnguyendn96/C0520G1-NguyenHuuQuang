package while_in_java.baitap;

import java.util.Scanner;

public class DisplayFigure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringFigure = "";

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j < i; j++) {
                stringFigure += "* ";
            }
            stringFigure += ("\n");
        }
        stringFigure += ("\n");


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 7; j++) {
                stringFigure += "* ";
            }
            stringFigure += ("\n");
        }
        stringFigure += ("\n");


        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                stringFigure += "* ";
            }
            stringFigure += "\n";
        }


        for (int i = 1; i <= 6; i++) {
            for (int j = (6-i); j >= 1; j--) {
                stringFigure += " ";
            }
            for (int k = 1; k < i; k++) {
                stringFigure += "* ";
            }
            stringFigure += "\n";
        }
        System.out.println(stringFigure);
    }
}
