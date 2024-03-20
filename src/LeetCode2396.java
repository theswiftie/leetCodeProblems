class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean isStrictlyPalindromic = true;
        for (int i = 2; i <= n - 2 && isStrictlyPalindromic; i++) {
            String inBase = Integer.toString(n, i);
            isStrictlyPalindromic = isStrictlyPalindromic(inBase);
        }
        return isStrictlyPalindromic;
    }
    private boolean isStrictlyPalindromic(String n) {
        if (n.length() == 0 || n.length() == 1) {
            return true;
        }
        else {
            if ((n.charAt(0)) == (n.charAt(n.length() - 1))) {
                return isStrictlyPalindromic(n.substring(1, n.length() - 1));
            }
            else {
                return false;
            }
        }
    }
}
