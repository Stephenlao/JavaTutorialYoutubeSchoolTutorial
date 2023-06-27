package javaTutorialSchool.week10;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
import java.nio.*;

public class question1 {
    public static void main(String[] args) {
        String directoryPath = "src/javaTutorialSchool/week10/";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileInput = scanner.nextLine();
        String filePath = directoryPath + fileInput;


        boolean isOpened = false;
        while (!isOpened) {
            try (Scanner input = new Scanner(Paths.get(filePath))) {
                System.out.println("File is opened successfully");
                isOpened = true;
            } catch (IOException io) {
                System.out.println("File input is not corrected, please re-enter file name");
                System.out.println("Enter file name: ");
                fileInput = scanner.nextLine();
                filePath = directoryPath + fileInput; // Update filePath with the new user input
            }
        }
        System.out.println("Done");
    }
}
