import java.util.*;

class sumoftarget {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for(int end = 0; end < arr.length; end++) {

            sum += arr[end];

            while(sum > target) {
                sum -= arr[start];
                start++;
            }

            if(sum == target) {
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        ArrayList<Integer> result = subarraySum(arr, target);

        System.out.println("Result: " + result);
    }
}
