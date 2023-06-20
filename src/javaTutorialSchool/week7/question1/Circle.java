package javaTutorialSchool.week7.question1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return String.format("Circle[radius: %.1f]", radius);
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

