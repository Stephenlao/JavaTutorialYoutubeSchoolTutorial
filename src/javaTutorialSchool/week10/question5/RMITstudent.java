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
        if (mark < 0 || mark > 100) {
            throw new MarkException("Invalid mark. Mark should be between 0 and 100");
        }
        if (marks.size() >= 3) {
            throw new CourseException("Cannot add more course");
        }

        // marks using map/hashmap to add-in code and mark
        marks.put(code, mark);
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }
}
