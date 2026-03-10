import java.util.*;

class secondlargestnumber {

    int getSecondLargest(int[] arr) {

        int largest = -1;
        int second = -1;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }

        return second;
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

        secondlargestnumber obj = new secondlargestnumber();

        int result = obj.getSecondLargest(arr);

        System.out.println("Second largest number: " + result);
    }
}
