package javaTutorialSchool.week3.revision;

import java.util.Scanner;

public class question1To5Recap {

    public static void printArray(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.printf("%d ", number[i]);
        }
        System.out.println();
    }

    // Question 1
    public static int[] generateRandomNumber(int number) {
        int[] randomNumberArray = new int[number];
        for (int i = 0; i < randomNumberArray.length; i++) {
            randomNumberArray[i] = (int) Math.round(Math.random() * number);
        }
        return randomNumberArray;
    }

    // Question 2

    public static int getIndexMin(int[] numbers) {
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //Question 3
    public static int getIndexMinFrom(int[] numbers, int from) {
        int minIndexfrom = from;
        for (int i = from; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndexfrom]) {
                minIndexfrom = i;
            }
        }
        return minIndexfrom;
    }

    //Question 4
    public static int[] exchangeMinFrom(int[] numbers, int from) {
        int minIndex = getIndexMinFrom(numbers, from);

        // swap
        int temp = numbers[from];
        numbers[from] = numbers[minIndex];
        numbers[minIndex] = temp;
        return numbers;
    }

    public static int[] sortSelectionArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            exchangeMinFrom(numbers, i);
        }
        return numbers;
    }

    public static void main(String[] args) {
        //Question 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int numberInput = scanner.nextInt();
        int[] numberArray;
        numberArray = generateRandomNumber(numberInput);
        printArray(numberArray);

        //Question 2
        int smallestIndex = getIndexMin(numberArray);
        System.out.printf(" The smallest number is %d at the index %d\n", numberArray[smallestIndex], smallestIndex);

        //Question 3
        int from = 3;
        int smallestIndexFrom = getIndexMinFrom(numberArray, from);
        System.out.printf(" The smallest number is %d from the index %d\n", numberArray[smallestIndexFrom], smallestIndexFrom);

        //Question 4
        int fromIndex = 3;
        exchangeMinFrom(numberArray, fromIndex);
        System.out.println("The new array after the exchange is:");
        printArray(numberArray);

        //Question 5
        int[] sortArray;
        sortArray = sortSelectionArray(numberArray);
        System.out.println("The new array after sorting is: ");
        printArray(sortArray);
    }


}

