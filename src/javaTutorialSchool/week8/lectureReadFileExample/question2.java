package javaTutorialSchool.week8.lectureReadFileExample;

import java.util.*;
import java.io.*;

public class question2 {
    public static void main(String[] args) {
        try {
            Scanner readFile = new Scanner(new File("src/javaTutorialSchool/week8/lectureReadFileExample/users.txt"));
            double sum = 0;
            double count = 0;
            // .hasNext() is used to read file, console, disc
            while (readFile.hasNext()) {
                // next() used to skip one element
                readFile.next();
                // nextLine() get all data in one line
                String name = readFile.nextLine();
                readFile.next();
                String address = readFile.nextLine();
                int age = readFile.nextInt();
                readFile.nextLine(); // Move to the next line. When using nextInt() should move to nextLine in order to not capturing the same line
                sum = sum + age;
                count++;
                System.out.printf("%s lives at %s and %d years old\n", name, address, age);
                readFile.nextLine(); // Skip the "-------------------" line
            }
            if (count > 0) {
                System.out.printf("Average age: %.2f", sum / count);
            }
        } catch (IOException IO) {
            IO.getMessage();
        }
    }
}
