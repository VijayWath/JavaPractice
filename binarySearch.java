import java.util.*;
import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int k = sc.nextInt();
        int result = Arrays.binarySearch(arr, k);
        System.out.println(result);
    }

}
