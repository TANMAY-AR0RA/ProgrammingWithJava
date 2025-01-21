import java.util.*;
public class ListInterface {
        public static void main(String[] args) {

            List<String> words = List.of("Apple", "Boat", "Cat"); // Immutable List, you cannot add or remove elements
            System.out.println(words); // [Apple, Boat, Cat]

            words.get(0); // Apple
            words.size(); // 3
            words.contains("Boat"); // true
            words.indexOf("Cat"); // 2
            words.isEmpty(); // false
            words.indexOf("Dog"); // -1


            List<String> wordsArrayList = new ArrayList<String>(words); // Mutable List
            System.out.println(wordsArrayList); // [Apple, Boat, Cat]

            wordsArrayList.add("Dog"); // [Apple, Boat, Cat, Dog]
            System.out.println(wordsArrayList); // [Apple, Boat, Cat, Dog]

            List<String> wordsLinkedList = new LinkedList<String>(words); // Mutable List
            System.out.println(wordsLinkedList); // [Apple, Boat, Cat]

            wordsLinkedList.add("Dog"); // [Apple, Boat, Cat, Dog]
            System.out.println(wordsLinkedList); // [Apple, Boat, Cat, Dog]

            List<String> wordsVector = new Vector<String>(words); // Mutable List
            System.out.println(wordsVector); // [Apple, Boat, Cat]




        }
}
