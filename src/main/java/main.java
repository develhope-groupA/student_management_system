import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        sms.addStudent("peter", 18, 12);
        sms.addStudent("Tom", 17, 11);
        sms.addStudent("Makena", 16, 13);



        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Display Total Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Search Student by Name");
            System.out.println("7. Search Student by Age");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter student grade: ");
                    int grade = scanner.nextInt();
                    sms.addStudent(name, age, grade);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    sms.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to update grade: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new grade: ");
                    grade = scanner.nextInt();
                    sms.updateStudentGrade(name, grade);
                    break;
                case 4:
                    sms.displayTotalStudents();
                    break;
                case 5:
                    sms.displayAllStudents();
                    break;
                case 6:
                    System.out.print("Enter student name to search: ");
                    name = scanner.nextLine();
                    sms.searchStudentByName(name);
                    break;
                case 7:
                    System.out.print("Enter student age to search: ");
                    age = scanner.nextInt();
                    sms.searchStudentByAge(age);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }


    }

