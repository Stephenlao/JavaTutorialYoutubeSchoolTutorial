package javaTutorialSchool.week4.revision;

import java.util.Scanner;

public class question4 {
    // using "this" keyword access in all method(only in non-static function)
    private int x;
    private int y;

    public question4() {
        this.x = 0;
        this.y = 0;
    }

    public question4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public question4(question4 p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x: ");
        int X = scanner.nextInt();
        System.out.println("Enter y: ");
        int Y = scanner.nextInt();
        this.x = X;
        this.y = Y;
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isOrigin() {
        return (x == 0 && y == 0);
    }

    public double distance(question4 p) {
        double d = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
        return d;
    }

    public static double distance(question4 p1, question4 p2) {
        double d = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        return d;
    }

    public static void main(String[] args) {
        question4 p1 = new question4();
        System.out.printf("The initial value of p1: %s\n", p1);
        System.out.printf("Is p1 at the origin?: %s\n", p1.isOrigin());
        System.out.println("Asking user to change values for p1!");
        p1.input();
        System.out.printf("The new value of p1: %s\n", p1);
        question4 p2 = new question4(4, 7);
        System.out.printf("The value of p2: %s\n", p2);
        question4 p3 = new question4(p2);
        System.out.printf("The value of p3: %s\n", p3);
        System.out.printf("First way to calculate distance between p1 and p2: %.2f\n", p1.distance(p2));
        System.out.printf("Second way to calculate distance between p1 and p2: %.2f\n", question4.distance(p1, p2));
        System.out.printf("First way to calculate distance between p2 and p3: %.2f\n", p2.distance(p3));
        System.out.printf("Second way to calculate distance between p2 and p3: %.2f\n", question4.distance(p2, p3));
    }
}
