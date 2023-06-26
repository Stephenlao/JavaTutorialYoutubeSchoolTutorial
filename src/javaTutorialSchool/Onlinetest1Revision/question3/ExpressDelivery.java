package javaTutorialSchool.Onlinetest1Revision.question3;


public class ExpressDelivery extends Services {
    static final double cost = 4;

    public ExpressDelivery(double distance) {
        super(distance, cost, "booked");
    }

    public String toString() {
        return String.format("%s,%s", super.toString(), "Express delivery services");
    }
}
