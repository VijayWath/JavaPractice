import java.util.*;

public class staramcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // fillef star box
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // hollow star box
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // triangle pattern
        // 1
        // 1 2 1
        // 1 2 3 2 1
        // 1 2 3 4 3 2 1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        // A
        // A B A
        // A B C B A
        // A B C D C B A
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print((char) (k + 64) + " ");
            }
            System.out.println();
        }
        // pyramid
        

    }
}
