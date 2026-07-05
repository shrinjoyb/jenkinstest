public class StudentGradeCalculator {

    public static void main(String[] args) {

        String name = "Shrinjoy";

        int java = 90;
        int sql = 85;
        int testing = 95;

        int total = java + sql + testing;
        double average = total / 3.0;

        String grade;

        if (average >= 90)
            grade = "A+";
        else if (average >= 80)
            grade = "A";
        else if (average >= 70)
            grade = "B";
        else if (average >= 60)
            grade = "C";
        else if (average >= 40)
            grade = "D";
        else
            grade = "Fail";

        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }
}