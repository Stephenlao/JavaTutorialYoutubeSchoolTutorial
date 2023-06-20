package javaTutorialSchool.week6.lecture.exercise2;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return String.format("Name: %s\nAddress:%s\nSchool:%s\nPay:%.2f\n", getName(), getAddress(), getSchool(), getPay());
    }
}
