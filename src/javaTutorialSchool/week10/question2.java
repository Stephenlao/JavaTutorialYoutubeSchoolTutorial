package javaTutorialSchool.week10;

import java.util.Scanner;
//import java.io.IOException;

// try: is used to do something inside execute the code
// catch: during executing code if errors appear, print errors ( need to modify)
public class question2 {
    public int getIntfromUser(int defaultValue) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integer number: ");
            int numberInput = scanner.nextInt();
            return numberInput;
        } catch (Exception e) {
            System.out.println("The number input is invalid");
            return defaultValue;
        }
    }

    public static void main(String[] args) {
        int defaultValue = 10;
        question2 userInput = new question2();
        System.out.printf("User input number: %d", userInput.getIntfromUser(defaultValue));
    }
}
