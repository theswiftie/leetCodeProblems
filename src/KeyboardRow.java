public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String solution = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            String [] rows = {"","",""};
            for (int j = 0; j < word.length(); j++) {
                rows[Hash(word.charAt(j))] = rows[Hash(word.charAt(j))] + word.charAt(j);
            }
            if ((rows[0] != null && rows[0].length() == word.length()) ||
                    (rows[1] != null && rows[1].length() == word.length()) ||
                    (rows[2] != null && rows[2].length() == word.length())){
                solution = solution + " " + word;
            }
        }
        if (solution == "") {
            return new String[0];
        }
        return (solution.strip()).split(" ");
    }

    private static int Hash(char letter) {
        letter = Character.toLowerCase(letter);
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        if (firstRow.indexOf(letter) != -1) {
            return 0;
        }
        else if (secondRow.indexOf(letter) != -1) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public static void main (String [] args) {
        String [] example = {"Hello","Alaska","Dad","Peace"};
        System.out.println(findWords(example).toString());
    }
}