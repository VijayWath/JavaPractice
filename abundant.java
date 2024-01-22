import java.util.*;

public class abundant {
    public static void isAbandant(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num < sum) {
            System.out.println("is Abundant");
        } else {
            System.out.println("not abundant");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isAbandant(num);
        sc.close();
    }
}
