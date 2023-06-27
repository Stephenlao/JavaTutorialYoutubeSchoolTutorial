package javaTutorialSchool.week6.revision.exercise3;

public class Circle extends Shape {
    private double radius = 1;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return String.format("Color: %s, Filled: %b, radius: %.2f", this.getColor(), this.isFilled(), this.getRadius());

    }
}
