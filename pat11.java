public class pat11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
