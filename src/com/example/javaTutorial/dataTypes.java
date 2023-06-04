package com.example.javaTutorial;

// always call class when creating another class in package, ex: dataTypes
public class dataTypes {
    public static void main(String[] args) {

//         Data types
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2135692541; // -2147483648 to 2147483648
        long aLargeNumber = 92344834848583838L; //-9223372036854775808 to 9223372036854775808

        //decimal types
        double aDouble = 1.798765; //4.9E-324 to 1.79
        float aFloat = 3.4028F; //1.4E-45 to 3.40

        //booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        //characters
        String aString = "Khang is awesome";
        System.out.println(aString);

        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(isTrue || isFalse);

        int randomNum = 55;
        System.out.println(++randomNum);
        System.out.println(randomNum);
    }
}
