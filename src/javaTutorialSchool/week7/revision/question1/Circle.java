package javaTutorialSchool.week7.revision.question1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("The circle info: Circle[radius = %.2f", this.getRadius());
    }

    public double getArea() {
        return Math.pow(this.getRadius(), 2) * Math.PI;
    }


}
