package javaTutorialSchool.week6.exercise1;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return String.format("%s\n", getName());
    }
}
