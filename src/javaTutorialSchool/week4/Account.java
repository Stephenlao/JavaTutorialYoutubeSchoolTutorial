package javaTutorialSchool.week4;

public class Account { // create class name Account
    private double balance; // create "attribute" name balance
    public Account(double initialBalance) { // create CONSTRUCTOR name "Account" in order to create objects later
        if (initialBalance >= 0.0) {
            balance = initialBalance;
        };

    }

    // method locate outside CONSTRUCTOR "Account"
    public void credit (double amount) { // method name "credit"
        balance = balance + amount;
    }

    public double getBalance() { // method name "getBalance"
        return balance;
    }

}


    
    
