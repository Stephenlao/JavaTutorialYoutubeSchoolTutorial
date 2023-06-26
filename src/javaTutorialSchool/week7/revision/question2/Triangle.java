package javaTutorialSchool.week7.revision.question2;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getArea() {
        return (this.getBase() * this.getHeight()) / 2.0;
    }

    public String toString() {
        return String.format("Rectangle[color=%s, base = %d, height =%d]", this.getColor(), this.getBase(), this.getHeight());
    }
}
