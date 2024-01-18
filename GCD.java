// import java.util.*;

// public class LCM {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int gcd = 0;

//         for (int i = 1; i <= a && i <= b; a++, b++) {
//             if (a % i == 0 && b % i == 0) {
//                 gcd = i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }

import java.util.*;

public class GCD {
    public static void main(String[] args) {
        int a, b, gcd = 0;
        System.out.print("\nEnter two numbers : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int i;
        for (i = 1; i <= a && i <= b; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        System.out.println("\nGCD of " + a + " and " + b + " is " + gcd);
        System.out.println();
    }

}