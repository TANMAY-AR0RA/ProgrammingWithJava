import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunnerWithWildCard {
    //wildcard example of upper bounded using <? extends Number>
    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    //wildcard example of lower bounded using <? super Number>
    static void addACoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumberList(List.of(10, 20, 30, 40, 50)));
        System.out.println(sumOfNumberList(List.of(10.5, 20.5, 30.5, 40.5, 50.5)));
        System.out.println(sumOfNumberList(List.of(10l, 20l, 30l, 40l, 50l)));

        List<Number> EmptyList = new ArrayList<>();
        addACoupleOfValues(EmptyList);
        System.out.println(EmptyList);

    }
}
