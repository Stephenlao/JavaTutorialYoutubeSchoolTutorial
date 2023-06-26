package javaTutorialSchool.week7.revision.question3;

public class Commision extends Hourly {
    private double totalSales;
    private double commisionRate;

    public Commision(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, double totalSales, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.totalSales = totalSales;
        this.commisionRate = commisionRate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void addSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double pay() {
        double commisionPayment = super.pay() + (this.getTotalSales() * this.getCommisionRate());
        return commisionPayment;
    }

    public String toString() {
        return String.format("%s\nTotal Sales: %.2f", super.toString(), this.getTotalSales());
    }

}
