package javaTutorialSchool.week8.lectureReadFileExample;

import java.util.*;
import java.io.*;

public class readMarks {
    public static void main(String[] args) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileWriter("src/javaTutorialSchool/week8/lectureReadFileExample/hello.txt", false));
            pw.println("Hello THERE!\n I'm writing to a txt file!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            if (pw != null)
                pw.close();
        }
//        Scanner fileScanner = new Scanner(new File("src/javaTutorialSchool/week8/lectureReadFileExample/marks.txt"));
//        double sum = 0;
//        int count = 0;
//        while (fileScanner.hasNext()) {
//            String sNum = fileScanner.next();
//            String firstName = fileScanner.next();
//            int mark = fileScanner.nextInt();
//            sum += mark;
//            count ++;
//            System.out.println(sNum + ":" + firstName + ":" + mark);
//        }
//        if (count >0)
//            System.out.printf("Average point: %.2f", sum/count);
//
//        fileScanner.close();


    }
}
