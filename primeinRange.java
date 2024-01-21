import java.util.*;

public class primeinRange {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                System.out.println(i +" is a prime number");
            }
            if (!prime) {
                System.out.println(i +" is not a prime number");
            }
        }
    }
}
