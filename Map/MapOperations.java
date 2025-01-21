import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);
        System.out.println(map);

        //map.put("d", 4); UnsupportedOperationException

        System.out.println(map.size()); //3
        System.out.println(map.isEmpty()); //false
        System.out.println(map.containsKey("a")); //true
        System.out.println(map.containsValue(1)); //true
        System.out.println(map.get("a")); //1
        System.out.println(map.keySet()); //[a, b, c]
        System.out.println(map.values()); //[1, 2, 3]
    }
}
