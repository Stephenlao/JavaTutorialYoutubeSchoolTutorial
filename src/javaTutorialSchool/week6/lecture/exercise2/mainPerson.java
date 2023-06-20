package javaTutorialSchool.week6.lecture.exercise2;

public class mainPerson {
    public static void main(String[] args) {
        Person person = new Person("Khang", "sala saroma S7-04");
        System.out.println(person);
        Student student1 = new Student("Uyen Doan", "Ni Su Huynh Lien", "Digital Marketing", 2025, 100);
        System.out.println(student1);
        Staff staff1 = new Staff("Khanh", "CMT8", "Ton Duc Thang", 80);
        System.out.println(staff1);
    }
}
