package javaTutorialSchool.week9.exercise2;

public class Square extends Rectangle {
    public Square() {

    }

    ;

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
        this.setWidth(side);
        this.setSide(side);
    }

    public void setWidth(double side) {
        this.setSide(side);
    }

    public String toString() {
        return String.format("%s, %.2f", super.toString(), this.getSide());
    }

}
