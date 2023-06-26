package javaTutorialSchool.week6.lecture.revision.exercise1;

public class Mammal extends Animal {

    // inheritance from Animal class only need to
    // use constructor to receive values then call "super"
    // to bring value back to "Animal"
    public Mammal(String name) {
        super(name);
    }

    public String toString() {
        return String.format("%s", super.toString());
    }
}
