package javaTutorialSchool.week4;

import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        Rectangle rectangle1 = new Rectangle(width,height);
        rectangle1.visualise();
    }
}
