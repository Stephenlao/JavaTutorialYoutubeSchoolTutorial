package javaTutorialSchool.week6.exercise3;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) / 2;
    }

    public String toString() {
        return String.format("A Rectangle with width = %.2f and length = %.2f, which is a subclass of Shape with color of %s and filled/notfilled", getWidth(), getLength(), getColor());
    }
}
