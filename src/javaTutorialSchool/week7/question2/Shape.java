package javaTutorialSchool.week7.question2;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0;
    }

    public String toString() {
        return String.format("Color = %s", this.color);
    }

    public String getColor() {
        return color;
    }
}
