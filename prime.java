import java.util.*;

public class prime {

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
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime) {
            System.out.println("it is a prime number");
        }
        if (!prime) {
            System.out.println("it is not a prime number");
        }
        sc.close();
    }

}