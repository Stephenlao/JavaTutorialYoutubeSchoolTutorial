package javaTutorialSchool.OnlineTest12022C.question3;

public class ExpressDelivery extends Services {
    static final int costperkm = 4;

    public ExpressDelivery(int distance) {
        super(distance, costperkm, "booked");
    }

    public String toString() {
        return String.format("%s,%s,", super.toString(), "Express delivery services");
    }
}
