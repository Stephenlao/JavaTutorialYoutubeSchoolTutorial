package javaTutorialSchool.week7.revision.question2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public String toString() {
        return String.format("Rectangle[color:%s]", this.getColor());
    }
}
