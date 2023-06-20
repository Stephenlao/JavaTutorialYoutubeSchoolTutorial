package javaTutorialSchool.week6.lecture.exercise3;

public class Square extends Rectangle {
    public Square() {
    }

    //super uses to call the inheritance super class
    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public String toString() {
        return String.format("A Square with side = %.2f, which is subclass of Shape with color of %s and filled/notfilled", getSide(), getColor());
    }
}
