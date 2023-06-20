package javaTutorialSchool.OnlineTest12022C.question2;

public class SavingAccount extends Account {
    private double savingInterestRate;

    public SavingAccount(String id, String name, double savingInterestRate) {
        super(id, name);
        this.savingInterestRate = savingInterestRate;
    }

    public SavingAccount(String id, String name, double balance, double savingInterestRate) {
        super(id, name, balance);
        this.savingInterestRate = savingInterestRate;
    }

    public void caculateInterestAmount() {
        double sumBalanceInterest = this.getBalance() + (this.getBalance() * savingInterestRate);
        this.setBalance(sumBalanceInterest);
    }

    public double getSavingInterestRate() {
        return savingInterestRate;
    }

    public void setSavingInterestRate(double savingInterestRate) {
        this.savingInterestRate = savingInterestRate;
    }

    public String toString() {
        return String.format("Saving Account: %s, name = %s, balance = %.2f,interest rate = %.2f ", this.getId(), this.getName(), this.getBalance(), this.getSavingInterestRate());
    }
}
