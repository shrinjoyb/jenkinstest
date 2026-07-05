import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter Marks in SQL: ");
        int sql = sc.nextInt();

        System.out.print("Enter Marks in Testing: ");
        int testing = sc.nextInt();

        int total = java + sql + testing;
        double average = total / 3.0;

        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("\n===== Student Report =====");
        System.out.println("Name    : " + name);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade   : " + grade);

        sc.close();
    }
}