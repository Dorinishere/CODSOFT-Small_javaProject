
    import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained (out of 100) in each subject.
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
        
        // Calculate Total Marks
        System.out.println("Total Marks Obtained: " + totalMarks);
        
        // Calculate Average Percentage
        double averagePercentage = (double) totalMarks / numOfSubjects;
        System.out.println("Average Percentage: " + averagePercentage + "%");
        
        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        // Display Results
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}

