package javaTutorialSchool.week6.lecture.exercise1;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String ToString() {
        return String.format("%s\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
