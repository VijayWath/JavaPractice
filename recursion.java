public class recursion {

    public static void printFib(int a, int b, int i) {
        if (i == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c);
        printFib(b, c, i - 1);
    }

    public static int calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int xPownm1 = calPower(x, n - 1);
        int xpown = x * xPownm1;
        return xpown;
    }

    public static int calPowerLog(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return calPowerLog(x, n / 2) * calPowerLog(x, n / 2);
        }
        if (n % 2 != 0) {
            return calPowerLog(x, n / 2) * calPowerLog(x, n / 2) * x;
        }
        return 0;
    }

    public static void main(String[] args) {
        // int a = 0;
        // int b = 1;
        // System.out.print(a);
        // System.out.print(b);
        // int i = 7;

        // printFib(a, b, i - 2);

        int x = 2;
        int n = 5;
        int ans = calPowerLog(x, n);
        System.out.println(ans);

    }
}