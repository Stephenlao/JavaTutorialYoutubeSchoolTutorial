package javaTutorialSchool.OnlineTest12022C.question3;

public class Drivers {
    private String name;
    private double wallet;
    private Services service;

    //    public Drivers(String name, int wallet) {
//        this.name = name;
//        this.wallet = wallet;
//    }
    public Drivers(String name) {
        this.name = name;
        this.wallet = 0;
    }

    public void accepts(Services service) {
        service.setStatus("Delivering");
        System.out.printf("The driver %s has accepted the delivery and is currently delivering it!\n", this.getName());
        this.service = service;
    }

    public void completes() {
        this.service.setStatus("Completed");
        System.out.printf("The driver %s have completed the delivery!\n", this.getName());
        this.wallet += this.service.calculateCost();
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

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }
}
