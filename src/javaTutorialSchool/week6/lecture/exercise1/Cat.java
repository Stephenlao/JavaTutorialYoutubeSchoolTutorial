package javaTutorialSchool.week6.lecture.exercise1;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    public String toString() {
        return String.format("%s\n", getName());
    }
}
