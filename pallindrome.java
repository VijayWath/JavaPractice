import java.util.*;

public class pallindrome {
    public static boolean isPallindromic(int num) {
        int temp = num, sum = 0;
        int remaider;
        while (temp != 0) {
            remaider = temp % 10;
            sum = (sum * 10) + remaider;
            temp /= 10;
        }
        if (num == sum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("elements");
        int[] arr = new int[n];
        int largest = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            boolean pallindrome = isPallindromic(arr[i]);
            if (pallindrome) {
                if (arr[i] >= largest) {
                    largest = arr[i];
                }
            }
        }
        System.out.println("largest Pallindrome: " + largest);
        sc.close();

    }
}
