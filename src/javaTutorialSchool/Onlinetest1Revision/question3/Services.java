package javaTutorialSchool.Onlinetest1Revision.question3;

public class Services {
    private double distance;
    private double cost;
    private String status;

    public Services(double distance, double cost, String status) {
        this.distance = distance;
        this.cost = cost;
        this.status = status;
    }

    public double caculatedistance() {
        double distance = this.distance * this.cost;
        return distance;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("Service:distance:%.2f,status:%s,cost:%.2f", this.getDistance(), this.getStatus(), caculatedistance());
    }

}
