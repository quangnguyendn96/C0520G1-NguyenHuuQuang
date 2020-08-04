package demo.epkieu;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class EpKieu {
    public static void main(String[] args) {
        Cake cake = new Cake();
        Candy candy = new Candy();
        Foody foody = new Foody();

        ArrayList a = new ArrayList();
        a.add(cake);
        a.add(candy);
        a.add(foody);

        Cake cake1 = (Cake) a;

    }
}
