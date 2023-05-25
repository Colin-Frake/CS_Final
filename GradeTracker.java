import java.util.ArrayList;
public class GradeTracker {

    private ArrayList<Student> roster;
    private ArrayList<Course> courses;

    public GradeTracker() {
        roster = new ArrayList<>();
        courses = new ArrayList<>();
    }

    //Adds a new student to the roster
    public void addStudent(Student student) {
        roster.add(student);
    }

    //Adds a course to the list of courses
    public void addCourse(Course course) {
        courses.add(course);
    }

    //Searches for a student given the student's ID
    public Student findStudentById(int id) {
        for (Student student : roster) { //enhanced for loop to look for student
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    //Searches for course given the courseID
    public Course findCourseByCode(String code) {
        //similar to findStudentByID() method
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    //Sorts student by alphabetical order
    public void sortStudentsByName() {
        roster.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    //Sorts courses by alphabetical order
    public void sortCoursesByName() {
        courses.sort((c1, c2) -> c1.getName().compareTo(c2.getName()));
    }

    //Calculating the average grade of one student
    public double calculateAverageGrade(int studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            return student.getAverageGrade();
        }
        return 0.0;
    }

    //Getter method
    public ArrayList<Student> getStudents() {
        return roster;
    }
}