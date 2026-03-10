import java.util.*;
class missingnumber {

    int missingNum(int arr[]) {

        int n = arr.length + 1;
        boolean[] visited = new boolean[n + 1];

        for(int i = 0; i < arr.length; i++) {
            visited[arr[i]] = true;
        }

        for(int i = 1; i <= n; i++) {
            if(!visited[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        missingnumber obj = new missingnumber();

        int result = obj.missingNum(arr);

        System.out.println("Missing number: " + result);
    }
}
