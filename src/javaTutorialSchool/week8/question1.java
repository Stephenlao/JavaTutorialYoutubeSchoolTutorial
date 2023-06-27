package javaTutorialSchool.week8;

import java.util.*;
import java.io.*;

public class question1 {
    public static void main(String[] args) {
        // using try/catch
        // printwriter and filewriter to create file path "users.txt" and write data into this file
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("src/javaTutorialSchool/week8/lectureReadFileExample/users.txt"));
            Scanner scanner = new Scanner(System.in);
            // set choice = "Y"
            String choice = "Y";

            // While loop  String choice = "Y" == "Y" execute inside code
            // equalsIgnoreCase accept "y" and "Y"
            while (choice.equalsIgnoreCase("Y")) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();

                System.out.print("Enter address: ");
                String address = scanner.nextLine();

                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                // Write user information to the file
                pw.print("Name: " + name + "\n");
                pw.print("Address: " + address + "\n");
                pw.print(age + "\n");
                pw.print("-------------------\n");

                System.out.print("Do you want to continue (Y/N)? ");
                // get Y/N from users then assign back to choice variable if Y continue loop N quit loop
                choice = scanner.nextLine();
            }

            pw.close();
            scanner.close();
            System.out.println("User information has been saved to users.txt file.");
            // using catch to show the fileWriter error if it has
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
