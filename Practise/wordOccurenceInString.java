import java.util.HashMap;
import java.util.Map;

public class wordOccurenceInString {
    public static void main(String[] args) {
        String sentence = "This is a test sentence";
        String newSentence = sentence.toLowerCase();

        String[] words = newSentence.split(" ");
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0)+1);
        }

        System.out.println(wordMap);
    }
}
