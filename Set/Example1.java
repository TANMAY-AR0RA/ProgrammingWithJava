import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<Character> characters = List.of('B', 'Z', 'F', 'A', 'Z', 'A', 'B');

        //Set types: HashSet, LinkedHashSet, TreeSet

        //Unique characters
        Set<Character> uniqueCharacters = new HashSet<>(characters);
        System.out.println(uniqueCharacters);
        //Output: [A, B, F, Z]

        Set<Character> charactersInsertedInOrder = new LinkedHashSet<>(characters);
        System.out.println(charactersInsertedInOrder);
        //Output: [B, Z, F, A]

        //Unique characters in sorted order
        Set<Character> sortedUniqueCharacters = new TreeSet<>(characters);
        System.out.println(sortedUniqueCharacters);
        //Output: [A, B, F, Z]
    }
}
