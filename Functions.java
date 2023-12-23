import java.util.*;

public class Functions {
    public static int Factorial(int a) {
        int factorial = 1;
        if (a > 0) {
            for (int i = a; i >= 1; i--) {
                factorial = factorial * i;
            }

        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int x = sc.nextInt();

        int factorial = Factorial(x);
        System.out.println(factorial);

    }

}
