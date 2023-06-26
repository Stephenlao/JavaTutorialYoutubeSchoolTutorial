package javaTutorialSchool.Onlinetest1Revision.question1;

import java.util.Scanner;

public class question1 {
    public void FirstFiveAddition(int n, int m) {
        for (int i = 1; i <= 5; i++) {
            int result = n + i * m;
            System.out.printf("%d + %d * %d = %d\n", n, i, m, result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        // because void and static is different, therefore create
        // new object in line 19
        question1 newAddition = new question1();
        newAddition.FirstFiveAddition(n, m);
    }
}
