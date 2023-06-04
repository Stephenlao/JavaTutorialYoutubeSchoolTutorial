package javaTutorialSchool.week1;

import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a positive integer: ");
            int posInteger = scanner.nextInt();
            if (posInteger < 0) {
                System.out.println("Goodbye!");
                break;
            }
            if(posInteger % 5 == 0 && posInteger % 6 == 0) {
                System.out.printf("%d is divisible by both 5 and 6 \n",posInteger);
            } else if (posInteger % 5 == 0 || posInteger % 6 == 0) {
                System.out.printf("%d is divisible by 5 or 6, but not both \n",posInteger);
            } else {
                System.out.printf("%d is neither divisible by 5 nor 6 \n", posInteger);
            }
        }
    }
}
