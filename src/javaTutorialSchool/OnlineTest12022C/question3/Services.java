package javaTutorialSchool.OnlineTest12022C.question3;

import java.util.Scanner;

public class Services {
    private int distance;
    private int costperkm;
    private String status;

    public Services(int distance, int costperkm, String status) {
        this.distance = distance;
        this.costperkm = costperkm;
        this.status = status;
    }

    public double calculateCost() {
        return distance * costperkm;
    }

    public String toString() {
        return String.format("Service: %distance:d, cost: %.2f, status: %s", getDistance(), calculateCost(), getStatus());
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCostperkm() {
        return costperkm;
    }

    public void setCostperkm(int costperkm) {
        this.costperkm = costperkm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
