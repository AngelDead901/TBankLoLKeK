package school;

import java.util.ArrayList;

public class Schoolroom {
    ArrayList<Student> students;
    private final char number;
    private final int parallel;

    public Schoolroom(char number, int parallel) {
        students = new ArrayList<>();
        this.number = number;
        this.parallel = parallel;
    }

    int getParallel() {
        return parallel;
    }

    int getNumber() {
        return number;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int AmountSuccsesfullStudents(boolean gender) {
        int count = 0;
        for (Student student : students) {
            if (student.isGender() == gender && student.avgRating >= 4) {
                count++;
            }
        }
        return count;
    }
}
