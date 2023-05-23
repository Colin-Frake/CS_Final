import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Double> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverageGrade() {
        if (grades.size() == 0) {
            return 0.0;
        }
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}