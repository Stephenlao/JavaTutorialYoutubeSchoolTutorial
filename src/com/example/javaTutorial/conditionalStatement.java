package com.example.javaTutorial;
import java.util.Scanner;

public class conditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operators you would like to choose? ");
        String operation = scanner.nextLine();
        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1,number2,number1+number2);
        }
        else if (operation.equals("subtraction")) {
            System.out.printf("%f - %f = %f", number1,number2, number1-number2);
        } else if (operation.equals("multiplication")) {
            System.out.printf("%f * %f = %f", number1,number2,number1 * number2);
        } else if (operation.equals("division")) {
            if (number2 == 0) {
                System.out.println("Can not divisible by 0");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        }
        else {
            System.out.print("The operation is not valid");
        }
        scanner.close();
    }
}
