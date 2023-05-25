public class Main {
    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();

        // Creating students
        Student alice = new Student("Alice", 1);
        alice.addGrade(85.0);
        alice.addGrade(90.0);
        alice.addGrade(95.0);

        Student bob = new Student("Bob", 2);
        bob.addGrade(75.0);
        bob.addGrade(80.0);
        bob.addGrade(88.0);

        // Creating courses and assigning students to courses
        Course math = new Course("Mathematics", "MATH101");
        math.addStudent(alice);
        math.addStudent(bob);

        Course physics = new Course("Physics", "PHYS102");
        physics.addStudent(alice);

        // Adding students and courses to the tracker
        tracker.addStudent(alice);
        tracker.addStudent(bob);
        tracker.addCourse(math);
        tracker.addCourse(physics);

        // Sorting students by name
        tracker.sortStudentsByName();

        // Displaying student names and average grades
        for (Student student : tracker.getStudents()) {
            System.out.println("Student: " + student.getName());
            System.out.println("Average Grade: " + student.getAverageGrade());
            System.out.println("------------------------");
        }

        // Calculating average grade for a specific student
        int studentId = 1;
        double averageGrade = tracker.calculateAverageGrade(studentId);
        System.out.println("Average Grade for Student with ID " + studentId + ": " + averageGrade);
    }
}
