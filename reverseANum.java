import java.util.*;

public class reverseANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int remainder = 0;
        for (int i = 0; num != 0; i++) {
            remainder = num % 10;
            rev = (rev * 10) + remainder;
            num = num/ 10;
        }
        System.out.println(rev);
    }
}
