package com.example.javaTutorial;
// in order to use array we need to call
// the import java.util.A
import java.util.Arrays;
public class array {
    public static void main (String[] args) {
        // line 8, we need to create variable and put it in the {}
        char vowels[] = {'e','i','a','u','o'};
        char copyVowels[] = Arrays.copyOf(vowels,vowels.length);


        Arrays.fill(vowels, 'x');

        Arrays.sort(vowels);
        int startingIndex = 1;
        int endingIndex = 4;

        char key = 'x';



        // Sort the array with starting and ending index
//        Arrays.sort(vowels,startingIndex,endingIndex);

        int foundKeyItems  = Arrays.binarySearch(vowels,key);



        // to print the result in array, use code in line 10
        System.out.println(Arrays.toString(vowels)); // [a,e,i,o,u]
        System.out.println(Arrays.toString(copyVowels)); // [a,e,i,o,u]
        System.out.println(foundKeyItems);

    }
}
