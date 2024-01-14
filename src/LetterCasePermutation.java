import java.util.ArrayList;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String s = "a1b2cd".toLowerCase();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = (s.toLowerCase()).toCharArray();
        ArrayList<String> result = new ArrayList<>();

        result.add(s);

        for (char c: chars) {
            String character = "" + c;
            int i = c;
            if (letters.contains(character)) {
                int j = 1;
            }
        }
    }
}