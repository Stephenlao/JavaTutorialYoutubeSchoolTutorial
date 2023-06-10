package javaTutorialSchool.week4;
import java.util.Scanner;


public class Point2D {
    // we create attributes x and y (line 7,8)
    // in order to allow access these attributes to object
    // additionally, it helps us to use "this" keyword
    // "this" keyword operates like "getter" can access anywhere
    // in object, methods,...
    private int x;
    private int y;

    public Point2D() {
        // Try to complete this with your code here
        x = 0;
        y = 0;
    }

    public Point2D(int x, int y) {
        // Try to complete this with your code here
//        System.out.print("("+x+","+y+")");
        this.x = x;
        this.y = y;

    }

    public Point2D(Point2D p) {
        // Try to complete this with your code here
        this.x = p.x;
        this.y = p.y;

    }

    public void input(){
        // Try to complete this with your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        int inputX = scanner.nextInt();
        System.out.print("Enter y: ");
        int inputY = scanner.nextInt();
        this.x = inputX;
        this.y = inputY;

    }

    public void move(int x, int y){
        // Try to complete this with your code here
//        this.x = x;
//        this.y = y;
    }

    public boolean isOrigin(){
        // Try to complete this with your code here
        return (x == 0 && y == 0);
    }

    // function distance takes Point2D as object p as para
    public double distance(Point2D p){
        // Try to complete this with your code here
        double d = Math.sqrt(Math.pow(x-p.x,2) + Math.pow(y-p.y,2));
        return d;
    }

    public static double distance(Point2D p1, Point2D p2){
        // Try to complete this with your code here
        return p1.distance(p2);
    }

    @Override
    public String toString(){
        // Try to complete this with your code here
        return ("("+x+","+y+")");
    }


    public int getX() {
        // Try to complete this with your code here
        return x;
    }

    public void setX(int x) {
        // Try to complete this with your code here
        x = x;
    }

    public int getY() {
        // Try to complete this with your code here
        return y;
    }

    public void setY(int y) {
        // Try to complete this with your code here
        y = y;
    }
}
