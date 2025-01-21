import java.util.HashMap;
import java.util.Map;

public class HashmapOperations{
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        Map<String, Integer> hashmap = new HashMap<>(map);

        System.out.println(hashmap);

        System.out.println(hashmap.put("d", 4)); // returns null as key is not present before
        System.out.println(hashmap);

        System.out.println(hashmap.put("a", 5)); // returns 1 as key is present before
        System.out.println(hashmap);


    }

}
