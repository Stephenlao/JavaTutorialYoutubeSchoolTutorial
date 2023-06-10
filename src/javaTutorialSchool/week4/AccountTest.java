package javaTutorialSchool.week4;

// In order to use the class "Account.java" create other
// class name "AccountTest.java" and using main to run
import java.util.Scanner;

    public class AccountTest {
        public static void main(String[] args) {
            Account account1 = new Account(50.00);
            Account account2 = new Account(-7.53);
            System.out.printf("Account 1 initial balance: %.2f\n",account1.getBalance());
            System.out.printf("Account 2 initial balance: %.2f\n", account2.getBalance());
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter deposit amount for account1: ");
            double amountAcc1 = scanner.nextDouble();
            System.out.printf("Adding %.2f to account 1 balance",amountAcc1);
            account1.credit(amountAcc1);
            System.out.printf("Account 1 balance: %.2f\n",account1.getBalance());
            System.out.printf("Account 2 balance: %.2f\n",account2.getBalance());

            System.out.print("Enter deposit amount for account2: ");
            double amountAcc2 = scanner.nextDouble();
            System.out.printf("Adding %.2f to account 2 balance\n",amountAcc2);
            account2.credit(amountAcc2);
            System.out.printf("Account 1 balance: %.2f\n",account1.getBalance());
            System.out.printf("Account 2 balance: %.2f\n",account2.getBalance());


        }
    }

