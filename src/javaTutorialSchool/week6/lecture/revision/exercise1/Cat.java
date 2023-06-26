package javaTutorialSchool.week6.lecture.revision.exercise1;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greet() {
        System.out.println("Meow");
    }

    public String toString() {
        return String.format("%s", super.toString());
    }
}
