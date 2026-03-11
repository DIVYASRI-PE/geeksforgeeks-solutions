import java.util.*;

class subsequenceordercheckappend {

    public int appendCharacters(String s, String t) {

        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return t.length() - j;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string s:");
        String s = sc.nextLine();

        System.out.println("Enter string t:");
        String t = sc.nextLine();

        Solution obj = new Solution();

        int result = obj.appendCharacters(s, t);

        System.out.println("Characters to append: " + result);
    }
}
