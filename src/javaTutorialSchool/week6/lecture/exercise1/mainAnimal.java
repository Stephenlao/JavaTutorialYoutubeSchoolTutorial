package javaTutorialSchool.week6.lecture.exercise1;

public class mainAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal("dog");
        System.out.println(animal.ToString());
        Mammal mammal = new Mammal("dolphin");
        System.out.println(mammal.toString());
        Dog animal1 = new Dog("Corgi");
        animal1.greets();
        Dog animal2 = new Dog("Kiki");
        animal1.greets(animal2);
        Cat animal3 = new Cat("Cat yellow fur");
        animal3.greets();

    }
}
