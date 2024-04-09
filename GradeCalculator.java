// Calculate the percentage and corresponding grade based on
//the given marks and total marks
import java.util.Scanner;
public class GradeCalculator {
        public static char calculateGrade(double percentage) {
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage <= 50) {
            grade = 'E';
        }else {
            grade = 'F';
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        int totalMarks = scanner.nextInt();
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scanner.nextInt();
        double percentage = obtainedMarks / totalMarks * 100;
        char grade = calculateGrade(percentage);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
