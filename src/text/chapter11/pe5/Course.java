package text.chapter11.pe5;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public List<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Course: ");
        stringBuilder.append(courseName);
        stringBuilder.append( "students[ ");
        for (String student : students) {
            stringBuilder.append(student);
            stringBuilder.append(" ");
        }
        stringBuilder.append( "]");
        return stringBuilder.toString();
    }
}