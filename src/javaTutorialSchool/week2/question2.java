package javaTutorialSchool.week2;

import java.util.Scanner;
public class question2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number: ");
            int numberInput = scanner.nextInt();
            for (int i = 0; i < numberInput; i++) {
                for (int j = 0; j < numberInput; j++) {
                    if (i==0 || i == numberInput -1 || j == 0 || j == numberInput -1) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
                System.out.println();

                // Specify the size of the square

            }
        }
    }

