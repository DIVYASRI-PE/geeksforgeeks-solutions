import java.util.*;

class subsequence {

    public boolean isSubsequence(String s, String t) {
        return rec(s, t, 0, 0);
    }

    private boolean rec(String s, String t, int i, int j) {

        if(i == s.length()) return true;
        if(j == t.length()) return false;

        if(s.charAt(i) == t.charAt(j)) {
            return rec(s, t, i + 1, j + 1);
        }

        return rec(s, t, i, j + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string (s):");
        String s = sc.nextLine();

        System.out.println("Enter second string (t):");
        String t = sc.nextLine();

        Solution obj = new Solution();

        boolean result = obj.isSubsequence(s, t);

        if(result) {
            System.out.println("s is a subsequence of t");
        } else {
            System.out.println("s is NOT a subsequence of t");
        }
    }
}
