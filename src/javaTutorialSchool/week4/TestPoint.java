package javaTutorialSchool.week4;

import java.util.Scanner;
public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first point x and y: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the second point x and y: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point Point1 = new Point(x1,y1);
        Point Target = new Point(x2,y2);
        System.out.printf("The distance between X and Y is: %.2f",Point1.distance(Target));
    }
}
