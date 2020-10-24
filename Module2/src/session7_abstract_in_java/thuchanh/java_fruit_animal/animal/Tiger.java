package session7_abstract_in_java.thuchanh.java_fruit_animal.animal;
import session7_abstract_in_java.thuchanh.java_fruit_animal.edible.Edible;

public class Tiger extends Animal implements Edible {


    @Override
    public String howToEat() {
        return "Tiger eat meal";
    }
//
    @Override
    public String makeSound() {
        return "tiger roar";
    }
}
