package session7_abstract_in_java.thuchanh.java_fruit_animal.animal;
import session7_abstract_in_java.thuchanh.java_fruit_animal.edible.Edible;

public class Chicken extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "Chicken cap cap";
    }

    @Override
    public String howToEat() {
        return "Chicken-rice";
    }
}
