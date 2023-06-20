package javaTutorialSchool.week6.lecture.exercise3;

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
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return ((radius * radius) * Math.PI);
    }

    public double getPerimeter() {
        return ((2 * radius) * Math.PI);
    }

    public String toString() {
        return String.format("A Circle with radius = %.2f, which is a subclass of Shape with color of %s and filled/notfilled", getRadius(), getColor());
    }


}
