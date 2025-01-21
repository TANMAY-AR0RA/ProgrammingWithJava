import java.util.Set;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(20, 35, 51, 94, 61, 18, 88));
        System.out.println("TreeSet: " + numbers);
        // Output: TreeSet: [18, 20, 35, 51, 61, 88, 94]

        //floor and ceiling are inclusive
        System.out.println("floor of 40" + numbers.floor(40)); // 35
        System.out.println("floor of 35" + numbers.floor(35)); // 35

        System.out.println("Ceiling of 48" + numbers.ceiling(48)); // 51
        System.out.println("Ceiling of 51" + numbers.ceiling(51)); // 51

        System.out.println(numbers.lower(35)); // 20
        System.out.println(numbers.higher(51)); // 61
        System.out.println(numbers.subSet(20, 61)); // [20, 35, 51]
        // - 20 is inclusive, 61 is exclusive

        System.out.println(numbers.subSet(20, true, 61, true));
        // [20, 35, 51, 61]

        System.out.println(numbers.headSet(51)); // [18, 20, 35]
        System.out.println(numbers.tailSet(51)); // [51, 61, 88, 94]
    }
}
