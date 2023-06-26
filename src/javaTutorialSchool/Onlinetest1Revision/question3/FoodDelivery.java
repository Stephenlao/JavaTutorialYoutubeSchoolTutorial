package javaTutorialSchool.Onlinetest1Revision.question3;

public class FoodDelivery extends Services {
    static final double cost = 2;

    public FoodDelivery(double distance) {
        super(distance, cost, "booked");
    }

    public String toString() {
        return String.format("%s,%s", super.toString(), "Food delivery Services");
    }

}
