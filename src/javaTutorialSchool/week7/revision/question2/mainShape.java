package javaTutorialSchool.week7.revision.question2;

import java.util.Scanner;

public class mainShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scanner.nextLine();
        System.out.println("Enter the length and width of the rectangle: ");
        int width = scanner.nextInt();
        int length = scanner.nextInt();
        Rectangle r1 = new Rectangle(color, length, width);
        System.out.printf("The area of rectangle: %.2f\n", r1.getArea());
        System.out.println("The rectangle info:" + r1);
        System.out.println("Enter the base and height of the rectangle: ");
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        Triangle tr1 = new Triangle(color, base, height);
        System.out.printf("The area of triangle: %.2f\n", tr1.getArea());
        System.out.println("The triangle info:" + tr1);
    }
}
