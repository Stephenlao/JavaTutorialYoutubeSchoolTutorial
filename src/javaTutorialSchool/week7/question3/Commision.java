package javaTutorialSchool.week7.question3;

public class Commision extends Hourly {
    private double totalSales;
    private double commisionRate;

    public Commision(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
        totalSales = 0;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double pay() {
        double totalPayment = super.pay() + (totalSales * commisionRate);
        return totalPayment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + this.totalSales;
        return result;
    }
}

