import java.math.BigDecimal;

public class Student {
    private final String name;
    private final int[] listOfMarks;

    public Student(String name, int[] listOfMarks) {
        this.name = name;
        this.listOfMarks = listOfMarks;
    }

    public int getNumberOfMarks() {
        return listOfMarks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : listOfMarks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        int maximum = Integer.MIN_VALUE;
        for(int mark : listOfMarks){
            if(mark > maximum){
                maximum = mark;
            }
        }
        return maximum;
    }

    public int getMinimumMark() {
        int minimum = Integer.MAX_VALUE;
        for(int mark : listOfMarks){
            if(mark < minimum){
                minimum = mark;
            }
        }
        return minimum;
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        int average = sum / number;
        return new BigDecimal(average);
    }
}
