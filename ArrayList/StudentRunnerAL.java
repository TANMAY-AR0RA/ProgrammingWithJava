import java.math.BigDecimal;

public class StudentRunnerAL {
    public static void main(String[] args) {
        String name = "Tanmay";
        int[] listOfMarks = {55, 66, 99, 98, 80};

        StudentAL student = new StudentAL(name, listOfMarks);

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark: " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average of marks: " + average);

        System.out.println(student);

        student.addNewMark(91);
        System.out.println(student);

        student.removeMarkAtIndex(0);
        System.out.println(student);

    }
}
