package javaTutorialSchool.week10.question5;

import java.util.HashMap;
import java.util.Map;

public class RMITstudent {
    private String name;
    private Map<String, Integer> marks;

    public RMITstudent(String name) {
        this.name = name;
        marks = new HashMap<>();
    }

    public void updateCourse(String code, int mark) throws RMITexception {
        if (marks.size() >= 3) {
            throw new CourseException("Cannot add more course");
        }
        if (mark < 0 || mark > 100) {
            throw new MarkException("Invalid mark. Mark should be between 0 and 100");
        }
        if (marks.containsKey(code)) {
            marks.put(code, mark);  // Update the existing course's mark
        } else {
            marks.put(code, mark);  // Add a new course and its mark
        }
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }
}
