package javaTutorialSchool.week4;

public class Point {
    private double x1;
    private double y1;

    // call "this" in order to use "getter"
    //outside constructor
    public Point(double x1, double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }


    // parameter distance(Point target)
    // in this case using Point to call back
    // constructor "Point" we truyen two para x1 and y1
    // by doing that we just only need to truyen 1 para in "distance"
    public double distance(Point target) {
        double d = Math.sqrt(Math.pow(x1-target.x1,2) + Math.pow(y1-target.y1,2));
        return d;
    }
}


