import java.util.*;

class getconcatenation {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2 * n];

        for(int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        getconcatenation obj = new getconcatenation();

        int[] result = obj.getConcatenation(nums);

        System.out.println("Concatenated array:");
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
