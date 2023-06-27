package javaTutorialSchool.week10.question3;

import java.lang.ClassCastException;

public class main {
    public static Dog treatmeasDog(Animal a) {
        try {
            Dog dog = (Dog) a;
            System.out.println("Cast ok");
            return dog;
        } catch (ClassCastException io) {
            System.out.println("invalid cast");
            return null;
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        treatmeasDog(dog);
        treatmeasDog(cat);
    }
}
