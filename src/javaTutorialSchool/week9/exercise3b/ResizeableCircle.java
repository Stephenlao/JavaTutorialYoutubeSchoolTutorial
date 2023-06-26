package javaTutorialSchool.week9.exercise3b;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle(double radius) {
        super(radius);
    }

    public String toString() {
        return String.format("%s", super.toString());
    }

    @Override
    public void resize(int percent) {
        this.setRadius(this.getRadius() * percent / 100);
    }
}
