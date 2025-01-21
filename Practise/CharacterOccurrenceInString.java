import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrenceInString {
    public static void main(String[] args) {
        String sentence = "This is a test sentence";
        String newSentence = sentence.toLowerCase();

        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : newSentence.toCharArray()){
            if(c == ' '){
                continue;
            }
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }

        System.out.println(charMap);
    }
}
