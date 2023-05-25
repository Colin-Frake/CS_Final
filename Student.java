import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Double> grades;

    //Each student has a unique name and Student ID
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    //Adds a grade to the student's list of grades
    public void addGrade(double grade) {
        grades.add(grade);
    }

    //Calculates the average grade off all of the student's grades
    public double getAverageGrade() {
        //checks if there are no grades for that student
        if (grades.size() == 0) {
            return 0.0;
        }
        //Calculates average
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}