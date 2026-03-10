import java.util.*;

class anagram {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s = sc.nextLine();

        System.out.println("Enter second string:");
        String t = sc.nextLine();

        Solution obj = new Solution();

        boolean result = obj.isAnagram(s, t);

        if(result) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
