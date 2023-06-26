package javaTutorialSchool.week7.revision.question1;

import java.util.Scanner;

public class mainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double circle = scanner.nextDouble();
        Circle c1 = new Circle(circle);
        System.out.println("The area of the circle: " + c1.getArea());
        System.out.println(c1);
        System.out.println("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        Cylinder Cy1 = new Cylinder(circle, height);
        System.out.println("The area of the cylinder: " + Cy1.getArea());
        System.out.println(Cy1);
    }
}
