package session7_abstract_in_java.thuchanh.java_fruit_animal.animal;

import session7_abstract_in_java.thuchanh.java_fruit_animal.edible.Edible;

public class Chicken extends Animal implements Edible {
    private String a;
    private String b;

    Chicken(String a, String b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public String toString() {
        return "Chicken{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    @Override
    public String makeSound() {
        return "Chicken cap cap";
    }

    @Override
    public String howToEat() {
        return "Chicken-rice";
    }

    public String lenMam() {
        return "7 mon";
    }
}
