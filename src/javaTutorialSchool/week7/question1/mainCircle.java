package javaTutorialSchool.week7.question1;

import java.util.Scanner;

public class mainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radiusInput = scanner.nextDouble();
        Circle c1 = new Circle(radiusInput);
        System.out.printf("The area of the circle: %f\n", c1.getArea());
        System.out.printf("The circle info: %s\n", c1);
        System.out.println("Enter the height of the cylinder: ");
        double heightInput = scanner.nextDouble();
        Cylinder c2 = new Cylinder(radiusInput, heightInput);
        System.out.printf("The area of the cylinder: %f\n", c2.getArea());
        System.out.printf("The cylinder info: %s", c2);


    }
}
