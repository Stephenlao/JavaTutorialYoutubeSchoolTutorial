package javaTutorialSchool.week7.question2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scanner.nextLine();
        Shape shape = new Shape(color);
        System.out.println("Enter the length and width of the rectangle: ");
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        Rectangle rectangle = new Rectangle(color, length, width);
        System.out.printf("The area of rectangle: %.1f\n", rectangle.getArea());
        System.out.printf("The rectangle info:%s\n", rectangle);
        System.out.println("Enter the base and height of the triangle: ");
        int base = scanner.nextInt();
        int height = scanner.nextInt();
        Triangle triangle = new Triangle(color, base, height);
        System.out.printf("The area of the triangle: %.1f\n", triangle.getArea());
        System.out.printf("The triangle info:%s\n ", triangle);

    }
}
