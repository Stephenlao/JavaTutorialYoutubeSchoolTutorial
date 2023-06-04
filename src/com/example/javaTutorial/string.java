package com.example.javaTutorial;

public class string {
    public static void main(String[] args) {
        String name = "Doan Phuong Uyen"; //%s
        String country = "Vietnam";
        String company = "RMIT";
        int age = 21; //%d
        double gpa = 3.3; //%f
        char percentSign = '%'; //%c
        boolean tellingTruth =  true; //%b
        // String.format() is the string that truyen value,
        // %s: use for string
        // %d: use for integer
        // %f: use for double (0.00)
        // %c: use for char
        // %b: use for boolean
        String formatedString = String.format(("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims " ),
                name,country,age,company,gpa,percentSign,tellingTruth);

        System.out.println(formatedString);
    }
}
