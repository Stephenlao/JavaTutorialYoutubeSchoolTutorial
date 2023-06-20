package javaTutorialSchool.week6.lecture;

// in order to inheretance the Super class (parent class)
// use extends + parent class (UniversityStaff)
public class Lecturer extends UniversityStaff {
    private double baseSalary;

    // constructor should declare the parameters
    // from scratch like we need to call the parameters
    // from "UniverisityStaff
    // use "super" to use from parent class
    public Lecturer(String name, String National_ID,
                    double hourlyRate, double totalWorkingHour,
                    double baseSalary) {
        super(name, National_ID, hourlyRate, totalWorkingHour);
        this.baseSalary = baseSalary;
    }

    // when inherance we can use the methods from parent class
    public double Earning() {
        return baseSalary + (getHourlyRate() * getTotalWorkingHour());
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    // we can return the value formatted by using method (ex: getName(), getNational_ID(),...)
    // can return the method value when methods return value with specific data types (return String,Int,Double types)
    public String toString() {
        return String.format("University Staff: %s\nNational ID: %s\nHourly Rate: %.2f\nTotal Working Hour: %.2f\nEarning: %.2f\nBase Salary: %.2f\n", getName(), getNational_Id(), getHourlyRate(), getTotalWorkingHour(), Earning(), getBaseSalary());
    }
}
