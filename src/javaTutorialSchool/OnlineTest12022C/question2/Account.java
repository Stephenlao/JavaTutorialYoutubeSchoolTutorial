package javaTutorialSchool.OnlineTest12022C.question2;

// Hint: using "this" keyword to assign the value in each method
public class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(double amount) {
        double balanceCredit = amount + this.getBalance();
        this.balance = balanceCredit;
    }

    public void debit(double amount) {
        if (amount < this.balance) {
            double balanceDebit = this.balance - amount;
            this.balance = balanceDebit;
        } else {
            System.out.println("The debit amount is larger than the balance");
        }
    }

    public void transferTo(Account another, double amount) {
        // caculate the first account - account
        double balanceAcc1 = this.balance - amount;
        // "another.balance" take "account 2" balance then + account
        another.balance += amount;
        // another.balance = another.balance + amount
        // assign balanceAcc1 to this.balance in order to update new
        // balance value, use this new value to other methods
        this.balance = balanceAcc1;
//        this.balance = another.balance;
    }

    public String toString() {
        return String.format("Account: %s, name = %s, balance = %.2f", this.getId(), this.getName(), this.getBalance());
    }
}
