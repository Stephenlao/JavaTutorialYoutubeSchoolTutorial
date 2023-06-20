package javaTutorialSchool.OnlineTest12022C.question3;

public class Clients extends Services {
    private String name;

    public Clients(String name, double distance, String deliveryType, double cost, String status) {
        super(distance, deliveryType, status, cost);
        this.name = name;
        this.setCost(0.0); // Assigning the value to the cost variable
    }

}
