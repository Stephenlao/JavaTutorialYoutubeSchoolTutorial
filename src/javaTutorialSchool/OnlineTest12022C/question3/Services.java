package javaTutorialSchool.OnlineTest12022C.question3;

import java.util.Scanner;

public class Services {
    private double distance;
    private String deliveryType;
    private String status;
    private double cost;

    public Services(double distance, String deliveryType, String status, double cost) {
        this.distance = distance;
        this.deliveryType = deliveryType;
        this.status = status;
        this.cost = cost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType1) {
        String[] deliveryName = {"food delivery", "express delivery"};
        boolean mark = false;
        while (!mark) {
            for (String i : deliveryName) {
                if (i.equals(deliveryType1)) {
                    mark = true;
                }
            }
            if (mark) {
                this.deliveryType = deliveryType1;
            } else {
                System.out.println("please re-enter delivery type!");
                Scanner scanner = new Scanner(System.in);
                deliveryType1 = scanner.nextLine();
            }
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status1) {
        String[] statusName = {"booking", "delivering", "delivered"};
        boolean mark = false;
        while (!mark) {
            for (String i : statusName) {
                if (i.equals(statusName)) {
                    mark = true;
                }
            }
            if (mark) {
                this.deliveryType = status1;
            } else {
                System.out.println("please re-enter status!");
                Scanner scanner = new Scanner(System.in);
                status1 = scanner.nextLine();
            }
        }
    }

}
