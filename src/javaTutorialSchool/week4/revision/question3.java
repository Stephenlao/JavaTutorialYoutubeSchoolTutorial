package javaTutorialSchool.week4.revision;

import java.util.Scanner;

public class question3 {
    private double x;
    private double y;

    public question3(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(question3 target) {
        double d = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first point x and y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println("Enter the second point x and y: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        question3 point1 = new question3(x, y);
        question3 point2 = new question3(x1, y1);
        System.out.printf("The distance between X and Y is: %.2f", point1.distance(point2));

    }

}
