package javaTutorialSchool.week6;

public class UniversityStaff {
    private String name;
    private String national_Id;
    private double hourlyRate;
    private double totalWorkingHour;

    public UniversityStaff(String name, String national_Id,
                           double hourlyRate, double totalWorkingHour) {
        this.name = name;
        this.national_Id = national_Id;
        this.hourlyRate = hourlyRate;
        this.totalWorkingHour = totalWorkingHour;
    }

    public double Earning() {
        return hourlyRate * totalWorkingHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational_Id() {
        return national_Id;
    }

    public void setNational_Id(String national_Id) {
        this.national_Id = national_Id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalWorkingHour() {
        return totalWorkingHour;
    }

    public void setTotalWorkingHour(double totalWorkingHour) {
        this.totalWorkingHour = totalWorkingHour;
    }

    public String toString() {
        return String.format("University Staff: %s\nNational ID: %s\nHourly Rate: %.2f\nTotal Working Hour: %.2f\nEarning: %.2f\n", name, national_Id, hourlyRate, totalWorkingHour, Earning());
    }
}
