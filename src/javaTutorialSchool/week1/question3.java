package javaTutorialSchool.week1;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seconds: ");
        int enterSec = scanner.nextInt();
        int hour = enterSec / 3600;
        int minute = (enterSec % 3600) / 60;
        int second = enterSec % 60;
        System.out.printf("%d:%d:%d", hour,minute,second);

    }
}
