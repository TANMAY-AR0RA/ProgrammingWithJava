import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner3 {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <Y extends List> void duplicate(Y list) {
        list.addAll(list);
    }
    public static void main(String[] args) {
        String value1 = doubleValue(new String("Hello"));
        System.out.println(value1);
        Integer value2 = doubleValue(Integer.valueOf(10));
        ArrayList list1 = doubleValue(new ArrayList());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 12, 35));
        duplicate(numbers);
        System.out.println(numbers);

        LinkedList<Integer> numbers2 = new LinkedList<>(List.of(100, 25, 31));
        duplicate(numbers2);
        System.out.println(numbers2);
    }
}
