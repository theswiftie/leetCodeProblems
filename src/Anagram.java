public class Anagram {
    public static int minSteps(String s, String t) {
        int steps = 0;
        int [] sTable = tablePopulator(s);
        int [] tTable = tablePopulator(t);

        for (int i = 0; i < s.length(); i++) {
            if (tTable[i] == 0 && sTable[i] != 0) {
                steps += sTable[i];
            }
            else {
                steps += Math.max(tTable[i] - sTable[i], 0);
            }
        }

        return steps;
    }

    public static int [] tablePopulator (String word) {
        int [] table = new int [26];
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            table[(int) letter - 'a'] += 1;
        }
        return table;
    }

    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "practice"));
        System.out.println(minSteps("aba", "bba"));

    }
}
