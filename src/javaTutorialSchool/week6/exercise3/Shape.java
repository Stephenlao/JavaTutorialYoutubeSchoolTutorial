package javaTutorialSchool.week6.exercise3;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return String.format("A Shape with color of %s and filled/notfilled", getColor());
    }
}
