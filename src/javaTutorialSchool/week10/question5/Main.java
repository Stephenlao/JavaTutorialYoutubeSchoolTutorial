package javaTutorialSchool.week10.question5;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RMITstudent student = new RMITstudent("John Doe");

        try {
            student.updateCourse("CS101", 85);
            student.updateCourse("CS102", 90);
            student.updateCourse("CS103", 95);
//            student.updateCourse("CS104", 80);  // Throws CourseException

            // Updating existing course
            student.updateCourse("CS102", 75);

        } catch (RMITexception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.printf("Student name: %s\n", student.getName());

        System.out.println("Student's marks:");
        for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
