import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagementSystem {
    private List<students> students;
    private Map<String, Integer> studentIndex;

    public StudentManagementSystem() {
        students = new ArrayList<>();
        studentIndex = new HashMap<>();
    }

    public void addStudent(String name, int age, int grade) {
        students student = new students(name, age, grade);
        students.add(student);
        studentIndex.put(name, students.size() - 1);
    }

    public void removeStudent(String name) {
        if (studentIndex.containsKey(name)) {
            int index = studentIndex.get(name);
            students.remove(index);
            updateStudentIndexes();
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    private void updateStudentIndexes() {

    }

    public void updateStudentGrade(String name, int grade) {
        if (studentIndex.containsKey(name)) {
            int index = studentIndex.get(name);
            students student = students.get(index);
            student.setGrade(grade);
            System.out.println("Student grade updated: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void displayTotalStudents() {
        System.out.println("Total students: " + students.size());
    }

    public void displayAllStudents() {
        for (students student : students) {
            student.displayInfo();
        }
    }

    public void searchStudentByName(String name) {
        if (studentIndex.containsKey(name)) {
            int index = studentIndex.get(name);
            students student = students.get(index);
            student.displayInfo();
        } else {
            System.out.println("Student not found: " + name);
        }
    }

    public void searchStudentByAge(int age) {
        boolean found = false;
        for (students student : students) {
            if (student.getAge() == age) {
                student.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with age: " + age);
        }
    }
}
