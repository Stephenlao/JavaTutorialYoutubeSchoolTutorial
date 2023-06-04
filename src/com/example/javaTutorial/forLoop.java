package com.example.javaTutorial;

public class forLoop {

    // CACULATE THE SUM IN ARRAY

    public static void main(String[] args) {
        int arrayNum[] = {1,2,3,4,5};
        int sum = 0;
        for( int num : arrayNum) {
            sum += num;
        }
        System.out.println(sum);


        // FIND THE ODD NUMBERS

        for (int i = 1; i<= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        // CACULATE THE MULTIPLE TABLE FROM 1 TO 10

        for( int number = 1; number <= 10; number ++) {
            for( int multiplier = 1; multiplier <= 10; multiplier ++) {
                System.out.printf("%d x %d = %d \n",number,multiplier,number * multiplier);
            }
        }


        //CACULATE SUM FROM 1 TO 10 USING FOR LOOP

        char listNumber[] = {1,2,3,4,5,6,7,8,9,10};
        int total = 0;
        for ( int index = 0; index < listNumber.length; index++ ) {
            total += listNumber[index];
        }
        System.out.println(total);
    }
}
