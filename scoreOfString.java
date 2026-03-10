import java.util.*;

class scoreOfString {

    public int scoreOfString(String s) {
        int score = 0;

        for(int i = 1; i < s.length(); i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }

        return score;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();

        scoreOfString obj = new scoreOfString();

        int result = obj.scoreOfString(s);

        System.out.println("Score of string: " + result);
    }
}
