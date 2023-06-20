package javaTutorialSchool.week6.lecture;

public class MainUniversity {
    public static void main(String[] args) {
        UniversityStaff staff = new UniversityStaff("Khang", "C12345", 10, 80);
        System.out.println("Staff information obtained by get methods: ");
        System.out.printf("%s %s\n", "First name is", staff.getName());
        System.out.printf("%s %s\n", "Social security number is", staff.getNational_Id());
        System.out.printf("%s %.2f\n", "Hourly rate is", staff.getHourlyRate());
        System.out.printf("%s %.2f\n", "Total Working Hour is", staff.getTotalWorkingHour());

        staff.setHourlyRate(15);
        System.out.printf("\n%s: \n%s", "Update staff information obtained by toString:", staff);

        Lecturer tom = new Lecturer("Tom", "C43252", 25, 160, 150);
        System.out.println("\n\nLecturer information obtained by get methods: ");
        System.out.printf("%s %s\n", "First name is", tom.getName());
        System.out.printf("%s %s\n", "Social security number is", tom.getNational_Id());
        System.out.printf("%s %.2f\n", "Hourly rate is", tom.getHourlyRate());
        System.out.printf("%s %.2f\n", "Total Working Hour is", tom.getTotalWorkingHour());

        tom.setHourlyRate(15);
        System.out.printf("\n%s: \n%s", "Update lecturer information obtained by toString:", tom);


    }
}
