package javaTutorialSchool.week6.revision.exercise3;

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
        return this.getWidth() * this.getLength();
    }

    public double getPerimeter() {
        return (this.getWidth() * this.getLength()) * 2;
    }

    public String toString() {
        return String.format("Color: %s, Filled: %b, Width: %.2f, Length: %.2f", this.getColor(), this.isFilled(), this.getWidth(), this.getLength());
    }
}
