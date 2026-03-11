import java.util.*;
class findMaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length, res = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = i; j < n; j++) {
                if (nums[j] == 0) break;
                cnt++;
            }

            res = Math.max(res, cnt);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements (0 or 1):");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int result = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive 1s: " + result);
    }
}
