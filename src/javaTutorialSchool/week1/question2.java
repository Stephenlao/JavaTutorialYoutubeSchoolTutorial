package javaTutorialSchool.week1;

public class question2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int temp = 0;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Value of x after swap: " + x);
        System.out.println("Value of y after swap: " + y);
    }
}
