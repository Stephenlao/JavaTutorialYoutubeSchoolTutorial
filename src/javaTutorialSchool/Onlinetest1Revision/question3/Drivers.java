package javaTutorialSchool.Onlinetest1Revision.question3;

public class Drivers {
    private String name;
    private double wallet;
    private Services service1;

    public Drivers(String name) {
        this.name = name;
        this.wallet = 0;
    }

    public void accepts(Services service1) {
        service1.setStatus("delivering");
        System.out.printf("The driver %s has accepted the delivery and is currently delivering it!\n", this.getName());
        this.service1 = service1;
    }

    public void completes() {
        service1.setStatus("completed");
        System.out.printf("The driver %s has completed the delivery\n", this.getName());
        this.wallet += service1.caculatedistance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

}
