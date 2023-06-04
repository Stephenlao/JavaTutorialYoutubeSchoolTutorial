package javaTutorialSchool.week1;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of A:  ");
        int aX = scanner.nextInt();
        int aY = scanner.nextInt();
        System.out.println("Enter coordinates of B: ");
        int bX = scanner.nextInt();
        int bY = scanner.nextInt();


        // Math in java does not need to import; sqrt is can bac hai, pow is binh phuong
        Double d = Math.sqrt(Math.pow((aX-aY),2)+ Math.pow((bX-bY),2));

        Double circumference = d * 4;
        Double area = d * 2;

        // %.2f is so thap phan 2 chu so
        System.out.printf("Circumference: %.2f ",circumference);
        System.out.printf("Area: %.2f", area);
    }
}
