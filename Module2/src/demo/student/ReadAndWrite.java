package demo.student;

import demo.exclip.AllBeing;

import java.io.*;

public class ReadAndWrite extends AllBeing {
   String name;
   String className;
   int i = 1;

    public ReadAndWrite(String name, String className) {
        this.name = name;
        this.className = className;
        i++;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        ReadAndWrite readAndWrite = new ReadAndWrite("Quang", "9//4");
        ReadAndWrite readAndWrite1 = new ReadAndWrite("An", "9//4");

    }
}
