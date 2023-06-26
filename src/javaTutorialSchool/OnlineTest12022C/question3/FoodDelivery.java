package javaTutorialSchool.OnlineTest12022C.question3;

public class FoodDelivery extends Services {
    static final int costperkm = 2;

    public FoodDelivery(int distance) {
        super(distance, costperkm, "booked");
    }

    public String toString() {
        return String.format("%s,%s", super.toString(), "Food delivery service");
    }
}
