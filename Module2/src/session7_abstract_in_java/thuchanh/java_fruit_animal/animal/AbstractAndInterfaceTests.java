package session7_abstract_in_java.thuchanh.java_fruit_animal.animal;

import java.util.ArrayList;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
//        Animal[] animals = new Animal[2];
//        animals[0] = new Tiger();
//        animals[1] = new Chicken();
//        for (Animal animal : animals) {
//            System.out.println(animal.howToEat());
//            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
//            }
//        }
//        TigerSon tigerSon = new TigerSon();
//        System.out.println(tigerSon.makeSound());
//
//
//        Fruit[] fruits = new Fruit[2];
//        fruits[0] = new Orange();
//        fruits[1] = new Apple();
//        for (Fruit fruit : fruits) {
//            System.out.println(fruit.howToEat());
//        }

        ArrayList<Animal> chickens = new ArrayList<>();
//        ArrayList<TigerSon> chickenss = new ArrayList<>();
//        chickenss.add(new Tiger());


        chickens.add(new Chicken("1","2"));
        chickens.add(new Chicken("3","4"));
        chickens.add(new Tiger());

        for(Animal animal : chickens){
            if(animal instanceof Chicken){
                Chicken chicken = (Chicken) animal;
                System.out.println(chicken.toString());
            }
        }


    }
}
