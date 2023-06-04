package javaTutorialSchool.week2;

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= userNumber; i++) {
            for (int j = 1 ; j <= userNumber; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
