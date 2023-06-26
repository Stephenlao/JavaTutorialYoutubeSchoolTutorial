package javaTutorialSchool.Onlinetest1Revision.question2;

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

    public void calculateInterestAmount() {
        double newAmountBalance = this.getBalance() + (this.getBalance() * this.getSavingInterestRate());
    }

    public double getSavingInterestRate() {
        return savingInterestRate;
    }

    public void setSavingInterestRate(double savingInterestRate) {
        this.savingInterestRate = savingInterestRate;
    }

    public String toString() {
        return String.format("SavingAccount: id=%s,name=%s,balance=%.2f,interest=%.2f", this.getId(), this.getName(), this.getBalance(), this.getSavingInterestRate());
    }
}
