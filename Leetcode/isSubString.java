public class isSubString {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println((isSubsequence("axc", "ahbgdc")));
        System.out.println((isSubsequence("", "ahbgdc")));
        System.out.println((isSubsequence("acb", "ahbgdc")));

    }

    /*
     * Given two strings s and t, return true if s is a subsequence of t, or false
     * otherwise.
     * 
     * A subsequence of a string is a new string that is formed from the original
     * string by deleting some (can be none) of the characters without disturbing
     * the relative positions of the remaining characters. (i.e., "ace" is a
     * subsequence of "abcde" while "aec" is not).
     */
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int aL = a.length;
        int bL = b.length;
        int index = -1;
        boolean match = false;
        for (int i = 0; i < aL; i++) {
            match = false;
            for (int j = i; j < bL; j++) {
                if (a[i] == b[j] && j > index) {
                    index = j;
                    match = true;
                    break;
                }
            }
            if (match == false) {
                return match;
            }
        }
        return match;
    }
}

/*
 * boolean contains = false;
 * int[] arr = new int[bL];
 * int counter = 0;
 * if(aL == 0)
 * {
 * return true;
 * }
 * for (int i = 0; i < aL; i++) {
 * contains = false;
 * char here = a[i];
 * for (int j = i; j < bL; j++) {
 * if (here == b[j]) {
 * contains = true;
 * arr[counter] = j;
 * counter++;
 * }
 * }
 * if (contains == false) {
 * return false;
 * }
 * }
 * return contains;
 * 
 */
