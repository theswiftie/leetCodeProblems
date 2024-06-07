//Leetcode Problem 1002

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        String [] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));
    }
    public static List<String> commonChars(String[] words) {
        String commonLetters = commonChars(words[0], words[1]);
        for (int i = 2; i < words.length; i++){
            commonLetters = commonChars(commonLetters, words[i]);
        }
        if (commonLetters.isEmpty()) {
            return new ArrayList<String>();
        }
        else {
            List <String> commonChars = new ArrayList<String>(Arrays.asList(commonLetters.split("")));
            return commonChars;
        }
    }
    public static String commonChars (String word1, String word2) {
        String commonLetters = "";
        for (char letter: word1.toCharArray()) {
            String replaced = word2.replaceFirst(letter + "", "X");
            if (replaced != word2) {
                commonLetters = commonLetters + letter;
                word2 = replaced;
            }
        }
        return commonLetters;
    }
}
