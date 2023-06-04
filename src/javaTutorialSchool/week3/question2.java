package javaTutorialSchool.week3;

import java.util.Scanner;
public class question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int userNumber = scanner.nextInt();
        for (int i = 0; i< userNumber; i++){
            for (int j = 0; j< userNumber; j++) {
                if (i==0 || i== userNumber-1 || j == 0 || j == userNumber-1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


}
