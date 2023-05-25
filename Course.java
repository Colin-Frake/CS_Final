import java.util.ArrayList;
public class Course {
    private String name;
    private String courseID;
    private ArrayList<Student> roster;

    public Course(String name, String code) {
        this.name = name;
        this.courseID = code;
        roster = new ArrayList<>();
    }

    //Adds a student to this specific course
    public void addStudent(Student student) {
        roster.add(student);
    }

    //Getter methods for the roster of students, name of course, and course ID(code)
    public ArrayList<Student> getStudents() {
        return roster;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return courseID;
    }
}