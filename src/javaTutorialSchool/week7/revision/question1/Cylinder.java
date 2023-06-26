package javaTutorialSchool.week7.revision.question1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getArea() {
        return 2 * Math.PI * this.getRadius() + 2 * Math.PI * super.getArea();
    }

    public String toString() {
        return String.format("Cylinder[radius = %.2f,height =%.2f]", this.getRadius(), this.getHeight());
    }
}
