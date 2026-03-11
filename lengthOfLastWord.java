import java.util.*;
class lengthOfLastWord  {

    public int lengthOfLastWord(String s) {

        int length = 0, i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == ' ') {

                while (i < s.length() && s.charAt(i) == ' ') {
                    i++;
                }

                if (i == s.length()) {
                    return length;
                }

                length = 0;

            } else {
                length++;
                i++;
            }
        }

        return length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String s = sc.nextLine();

        Solution obj = new Solution();

        int result = obj.lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}
