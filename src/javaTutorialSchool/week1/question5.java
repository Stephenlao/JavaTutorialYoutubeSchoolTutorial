package javaTutorialSchool.week1;

public class question5 {
    public static void main(String[] args ) {
        // /t  means tab create space between words
        System.out.println("Miles \t \t Kilometers");
        double mileConversion = 1.610;
        for (int mile = 1; mile <= 10; mile ++) {
            double km = mile * mileConversion;
            //  /n is next line (xuong dong) %.2f means lam tron den
            // chu so thap phan thu 2
            System.out.printf("%d \t \t \t %.2f\n", mile, km);
        }

        System.out.println();
        System.out.println("Kilometers \t Miles");
        for (int km = 20; km <= 65;km += 5) {
            double miles  = km / 1.610;
            System.out.printf("%d \t \t %.2f\n ", km , miles);
        }
        }
    }

