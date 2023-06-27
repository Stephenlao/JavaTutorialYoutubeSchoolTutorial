package javaTutorialSchool.week6.revision.exercise3;

public class Square extends Rectangle {
    public Square() {
    }

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
        this.setLength(side);
    }

    //    public void setWidth(double side) {
//        this.setSide(side);
//    }
    public String toString() {
        return String.format("%s", super.toString());
    }


}
