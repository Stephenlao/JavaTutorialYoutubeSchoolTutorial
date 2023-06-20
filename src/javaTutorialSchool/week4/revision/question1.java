package javaTutorialSchool.week4.revision;

import java.util.Scanner;

public class question1 {
    private int width;
    private int height;

    public question1(int width, int height) {
        this.width = width;
        this.height = height;
        if (this.width < 0) {
            System.out.print("Warning: input width is negative!\n");
        } else if (this.height < 0) {
            System.out.print("Warning: input height is negative!\n");
        }
    }

    public void visualise() {
        if (width > 0 && height > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (width > 0 && height < 0) {
            for (int i = 1; i <= width; i++) {
                System.out.print("*");
            }
        } else {
            for (int i = 1; i <= height; i++) {
                System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
        //Question 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        question1 rectangle = new question1(width, height);
        rectangle.visualise();
    }
}
