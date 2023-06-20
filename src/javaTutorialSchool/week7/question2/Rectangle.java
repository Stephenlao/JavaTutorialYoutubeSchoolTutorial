package javaTutorialSchool.week7.question2;


public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return (this.length * this.width);
    }

    public String toString() {
        return String.format("Rectangle[color = %s,Length: = %d, Width = %d] ", this.getColor(), this.getLength(), this.getWidth());
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
