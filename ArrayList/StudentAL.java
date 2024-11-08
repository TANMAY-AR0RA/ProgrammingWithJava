import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class StudentAL {
    private String name;
    private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    public StudentAL(String name, int ...listOfMarks) {
        this.name = name;

        for(int mark : listOfMarks){
            this.listOfMarks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark : listOfMarks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        return Collections.max(listOfMarks);
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

    public void addNewMark(int i) {
        listOfMarks.add(i);
    }

    public void removeMarkAtIndex(int i) {
        listOfMarks.remove(i);
    }

    @Override
    public String toString() {
        return "StudentAL{" +
                "name='" + name + '\'' +
                ", listOfMarks=" + listOfMarks +
                '}';
    }
}
