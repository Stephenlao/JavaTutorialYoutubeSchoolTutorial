package javaTutorialSchool.week3;

import java.awt.*;
import java.util.Scanner;
public class question1To5 {
    //Question 1
    public static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public static int[] generateRandomNumberArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * number);
        }
        return array;
    }


    //Question 2
    public static int getIndexMin(int[] numbers) {
        int indexMin = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    //Question 3
    public static int getIndexMinForm(int[] numbers, int form) {
        int indexMin = form;
        for( int i = form; i < numbers.length; i++ ) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }


    // Exercise 4
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        // Use the result of exercise 3 method to find the index of smallest number from given index
        int index = getIndexMinForm(numbers, from);

        // if the index is invalid then we just simply return the array without doing anything else.
        if (index == -1) {
            return numbers;

        }
        // classic way to swap two numbers
        int temp = numbers[from];
        numbers[from] = numbers[index];
        numbers[index] = temp;
        return numbers;
    }

    // Exercise 5
    public static void sortBySelection(int[] numbers) {
        // Repeat exercise 4 for every smaller sub array (Divide & Conquer!)
        for (int i = 0; i < numbers.length; i++) {
            exchangeMinFrom(numbers, i);
        }
    }


    public static void main(String[] args) {
        //question 1
        int[] arrayNumber;
        arrayNumber = generateRandomNumberArray();
        System.out.print("The generate numbers are: ");
        printArray(arrayNumber);

        //question 2
        int smallestIndex = getIndexMin(arrayNumber);
        System.out.printf("The smallest number is %d of the index %d\n",arrayNumber[smallestIndex], smallestIndex);

        //Question 3
        int form = 3;
        int smallestIndexForm = getIndexMinForm(arrayNumber,form);
        System.out.printf("The smallest number is %d at index %d from index %d \n",arrayNumber[smallestIndexForm],smallestIndexForm,form);
        // Exercise 4
        // You can change the from index to test your exercise 4 function!
        int fromIndex = 3;
        exchangeMinFrom(arrayNumber, fromIndex);
        System.out.println("The new array after the exchange is:");
        printArray(arrayNumber);
        // Exercise 5
        sortBySelection(arrayNumber);
        System.out.println("The new array after sorting is:");
        printArray(arrayNumber);

    }
}
















