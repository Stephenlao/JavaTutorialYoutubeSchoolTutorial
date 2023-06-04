package javaTutorialSchool.week2;
import java.util.Scanner;
public class question3 {
//        public static void main(String[] args){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Please enter 3 numbers for the sides of a triangle: ");
//            double a = scanner.nextDouble();
//            double b = scanner.nextDouble();
//            double c = scanner.nextDouble();
//            if (a == b && b == c && c == b) {
//                System.out.print("Equilateral triangle");
//            } else if (a == b || b == c || a == c) {
//                System.out.print("Isoslene triangle");
//            } else if (a + b > c && b + c > a && a + c > b) {
//                System.out.print("Scalene triangle");
//            } else {
//                System.out.print("not a triangle");
//            }
//        }

    // Calling public static String create the method
    public static String exercise3a() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a == b && b == c && c == b) {
           return "Equilateral triangle";
        } else if (a == b || b == c || a == c) {
          return "Isoslene triangle";
        } else if (a + b > c && b + c > a && a + c > b) {
          return  "Scalene triangle";
        } else {
          return  "not a triangle";
        }
    }

    // creating public static void, calling main inside calling function exercise3a()
    public static void main(String[] args) {
        String triangleType = exercise3a();
        System.out.println(triangleType);
    }
}






