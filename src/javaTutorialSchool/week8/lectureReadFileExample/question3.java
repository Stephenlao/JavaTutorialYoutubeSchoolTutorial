package javaTutorialSchool.week8.lectureReadFileExample;

import java.io.*;
import java.util.*;

public class question3 {
    public static void main(String[] args) throws IOException {
        Scanner readFile = new Scanner(new File("src/javaTutorialSchool/week8/lectureReadFileExample/vietnam-temperature-from-1901-2015.csv"));
        String line;
        double sum = 0;
        double count = 0;
        double temperate;
        // create variable named coldestTemperature finding double max value
        //REMEMBER!!!!!!
        double coldestTemperature = Double.MAX_VALUE;
        // create variable named hottestTemperature finding double min value
        //REMEMBER!!!!!!
        double hotestTemperature = Double.MIN_VALUE;
        int year, month;
        String country;
        int minMonth = 0;
        int minYear = 0;
        int maxMonth = 0;
        int maxYear = 0;
        // use line 14 and 15 to skip the first line of file
        if (readFile.hasNextLine()) {
            readFile.nextLine();
        }
        while (readFile.hasNext()) {
            double temp;
            count++;
            line = readFile.nextLine();
            StringTokenizer inRead = new StringTokenizer(line, ",");
            if (inRead.countTokens() != 4) {
                throw new IOException("Invalid input format");
            } else {
                temperate = Double.parseDouble(inRead.nextToken());
                year = Integer.parseInt(inRead.nextToken());
                month = Integer.parseInt(inRead.nextToken());
                country = inRead.nextToken();
                sum = sum + temperate;
                // use the coldestTemperature create before to find the min temperature(coldest) then
                // using this min temperature assign to variable "coldestTemperature" and do while loop till
                // finding the coldest one
                if (temperate < coldestTemperature) {
                    coldestTemperature = temperate;
                    minMonth = month;
                    minYear = year;
                }

                if (temperate > hotestTemperature) {
                    hotestTemperature = temperate;
                    maxMonth = month;
                    maxYear = year;
                }
//                coldestTemperature = Math.min(coldestTemperature, temperate);
                // hottest like coldest
//                hotestTemperature = Math.max(hotestTemperature, temperate);

            }
        }
        if (count > 0) {
            System.out.printf("Average temperature is: %f\n", sum / count);
            System.out.println("-----------------------------");
            System.out.printf("Coldest temperature is: %f\n ", coldestTemperature);
            System.out.printf("Month of the coldest temperature: %d\n ", minMonth);
            System.out.printf("Year of the coldest temperature: %d\n ", minYear);
            System.out.println("-----------------------------");
            System.out.printf("Hottest temperature is: %f\n ", hotestTemperature);
            System.out.printf("Month of the hottest temperature: %d\n ", maxMonth);
            System.out.printf("Year of the hottest temperature: %d\n ", maxYear);
        }
    }


}
