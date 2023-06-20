package javaTutorialSchool.week7.question1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // using "super" keyword to inheritance from "Circle" (superclass)
    // in this case super.getArea() call back the area of circle
    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * this.getRadius() * this.getHeight();
    }

    public String toString() {
        return String.format("Cylinder[radius=%.2f,height=%.2f]", this.getRadius(), this.getHeight());
    }
}
