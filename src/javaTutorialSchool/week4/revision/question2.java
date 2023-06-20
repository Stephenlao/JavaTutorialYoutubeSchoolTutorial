package javaTutorialSchool.week4.revision;

import java.util.Scanner;

public class question2 {
    private int x;
    private int y;
    private int z;

    public question2(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String verify() {
        if (x + y > z && y + z > x && x + z > y) {
            if (x == y && y == z) {
                return "Equilateral Triangle";
            } else if (x == y || y == z) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        } else {
            return "Not Triangle";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        question2 triangle = new question2(x, y, z);

        // using System.out.println because
        // verify() method return String
        // if do not want to use system.out
        // create String printVerify = triangle.verify()
        // System.out.println(printVerify);
        System.out.println(triangle.verify());
    }
}
