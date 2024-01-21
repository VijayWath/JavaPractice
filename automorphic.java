import java.util.*;

public class automorphic {
    public static boolean isAutomorphic(int num) {
        int sqrt = num * num;
        if (num % 10 == sqrt % 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean automorphic = isAutomorphic(num);
        if (automorphic) {
            System.out.println("automorphivc");
        }
        if (!automorphic) {
            System.out.println("not automorphivc");
        }
    }
}
