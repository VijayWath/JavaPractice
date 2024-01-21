import java.util.*;

public class fibbonaci {

    public static void retfibbonaci(int a, int b, int n) {
        int c = a + b;
        if (c > n) {
            return;
        }
        System.out.print(c + " ");
        retfibbonaci(b, c, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        System.out.print(b);
        retfibbonaci(a, b, n);
        sc.close();
    }
}
