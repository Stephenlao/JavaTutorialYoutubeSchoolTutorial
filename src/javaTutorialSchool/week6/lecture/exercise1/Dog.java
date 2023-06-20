package javaTutorialSchool.week6.lecture.exercise1;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    public String toString() {
        return String.format("%s\n", toString());
    }


}
