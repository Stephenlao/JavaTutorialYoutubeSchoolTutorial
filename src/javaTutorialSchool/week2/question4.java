package javaTutorialSchool.week2;

import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle 1's center x-, y-coordinates, and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        System.out.println("Enter circle 2's center x-, y-coordinates, and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double  r2 = scanner.nextDouble();

        double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        if (d < r1 - r2) {
            System.out.println("One circle is inside another circle!");
        } else if ( d < r1 + r2){
            System.out.println("One circle is overlap other circle");
        } else {
            System.out.println("Two circle do not overlap each other!");
        }
    }



}
