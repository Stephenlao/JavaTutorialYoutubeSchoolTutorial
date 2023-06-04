// SWITCH CASE USE SIMILAR TO IF ELSE, BUT WAYS TO
// EXECUTE THE SYNTAX IS MUCH FASTER AND CONVENIENT THAN IF ELSE

package com.example.javaTutorial;

import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        Double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter second number: ");
        Double number2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("What operation you would like to choose? ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1+number2);
                break;
            case "subtraction":
                System.out.printf("%f - %f = %f", number1, number2, number1-number2);
                break;
            case "multiplication":
                System.out.printf("%f * %f = %f", number1, number2, number1*number2);
                break;
            case "division":
                if (number2 == 0) {
                    System.out.println("can not divisible by 0");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1/number2);
                }
                break;
            default:
                System.out.print("The operation is not valid");
        }

    }
}
