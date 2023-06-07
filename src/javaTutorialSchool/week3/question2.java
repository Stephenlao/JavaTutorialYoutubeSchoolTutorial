package javaTutorialSchool.week3;

import java.util.Scanner;
public class question2 {

    //question 1

    public static void printNumber(int[] numbers) {
        for (int j:numbers) {
            System.out.printf("%d ",j);
        }
        System.out.println();
    }
    public static int[] generateRandomNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many random numbers to generate for array: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i =0; i< array.length; i++) {
            array[i] = (int) Math.round(Math.random() *number);

        }
        return array;
    }

    //question 2
    public static int getIndexMin(int[] numbers) {
        int indexMin = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < indexMin) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    //question 3
    public static int getIndexMinFrom(int[] numbers, int from){
        int indexMin = from;
        for (int i = from; i < numbers.length; i++) {
            if (numbers[i] < numbers[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static void main(String[] args) {
        //question 1
        int[] myArray;
        myArray = generateRandomNum();
        System.out.println("The generated array is: ");
        printNumber(myArray);

        //question 2
        int smallestIndex = getIndexMin(myArray);
        System.out.printf("The smallest number is %d at index of %d \n",myArray[smallestIndex],smallestIndex);

        //question 3
        int fromIndex = 3;
        int smallestIndexFrom = getIndexMinFrom(myArray, fromIndex);
        System.out.printf("The smallest number is %d at index of %d from index of %d",myArray[smallestIndexFrom],smallestIndex,fromIndex);
    }

}
