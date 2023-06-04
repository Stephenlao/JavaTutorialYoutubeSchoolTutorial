package com.example.javaTutorial;
// calling import 'java.util.Scanner for getting the user inputs
import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello %s. How old are you ? ",name);

        // using Integer.parseInt to get the input for users under the int
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d is the wonderful age for programming. What is your hobbies %s ? ",age,name);
        String hobbies = scanner.nextLine();
        System.out.printf("%s your hobbies is interesting, it helps you to keep fit and energetic as well. What is your gpa? ",hobbies);

        // using Integer.parseInt to get the input for users under the double (0.000)
        Double gpa = Double.parseDouble(scanner.nextLine());
        System.out.printf("%f is the career best of gpa, keep going, cheers",gpa);


//         println: print in the next line
//         print: print in the same line
//         printf: print formatted, print the string in format using % like String.format()
    }
}
