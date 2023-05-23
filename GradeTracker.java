import java.util.ArrayList;
public class GradeTracker {

    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public GradeTracker() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public Course findCourseByCode(String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    public void sortStudentsByName() {
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    public void sortCoursesByName() {
        courses.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    public double calculateAverageGrade(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            return student.getAverageGrade();
        }
        return 0.0;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
}