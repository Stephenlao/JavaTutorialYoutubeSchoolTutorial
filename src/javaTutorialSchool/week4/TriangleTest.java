package javaTutorialSchool.week4;

import java.util.Scanner;
public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        Triangle triangle1 = new Triangle(x ,y ,z);
        String result = triangle1.verify();
        System.out.println(result);
    }
}
