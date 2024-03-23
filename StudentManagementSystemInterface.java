import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String Name;
    private int Enrollment;
    private String Grade;

    public Student(String Name, int Enrollment, String Grade) {
        this.Name = Name;
        this.Enrollment = Enrollment;
        this.Grade = Grade;
    }

    public String getName() {
        return Name;
    }

    public int getRollNumber() {
        return Enrollment;
    }

    public String getGrade() {
        return Grade;
    }

    @Override
    public String toString() {
        return "Name: " + Name + ", Roll Number: " +Enrollment + ", Grade: " + Grade;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int rollNumber) {
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class StudentManagementSystemInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student Data");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String Name = scanner.nextLine();
                    System.out.print("Enter student Enrollment number: ");
                    int Enrollment = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter student Grade: ");
                    String Grade = scanner.nextLine();
                    Student newStudent = new Student(Name, Enrollment, Grade);
                    system.addStudent(newStudent);
                    System.out.println("Student added SUCCESSFUL!");
                    break;
                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    system.removeStudent(rollToRemove);
                    System.out.println("Student removed successfully!");
                    break;
                case 3:
                    System.out.print("Enter roll number of student to search: ");
                    int rollToSearch = scanner.nextInt();
                    Student foundStudent = system.searchStudent(rollToSearch);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.println("All students:");
                    system.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

