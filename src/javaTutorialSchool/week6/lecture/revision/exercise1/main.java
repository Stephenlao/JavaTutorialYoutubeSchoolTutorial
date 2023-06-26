package javaTutorialSchool.week6.lecture.revision.exercise1;

public class main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("kiki");
        System.out.println(animal1);
        Mammal mammal1 = new Mammal("Dog");
        System.out.println(mammal1);
        Cat cat1 = new Cat("Chiwawa");
        System.out.println(cat1);
        cat1.greet();
        Dog dog1 = new Dog("Corgi");
        Dog dog2 = new Dog("Buddle");
        dog1.greet();
        dog1.greet(dog2);


    }
}
