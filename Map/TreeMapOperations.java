import java.util.TreeMap;

public class TreeMapOperations {
    public static void main(String[] args) {
        //methods of TreeMap extended from Navigable Map interface
        //floorEntry, floorKey, ceilingEntry, ceilingKey,
        // lowerEntry, lowerKey, higherEntry, higherKey

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Z", 20);
        treeMap.put("A", 10);
        treeMap.put("X", 30);
        treeMap.put("C", 40);
        treeMap.put("M", 50);

        System.out.println(treeMap); // {A=10, C=40, M=50, X=30, Z=20}
        System.out.println(treeMap.higherKey("C")); // M
        System.out.println(treeMap.lowerKey("M")); // C
        System.out.println(treeMap.ceilingKey("X")); // X
        System.out.println(treeMap.floorKey("D")); // C

        System.out.println(treeMap.subMap("C", "X")); // {C=40, M=50}
        System.out.println(treeMap.subMap("C", true, "X", true)); // {C=40, M=50, X=30}
        System.out.println(treeMap.firstEntry()); // A=10
        System.out.println(treeMap.lastEntry()); // Z=20


    }
}
