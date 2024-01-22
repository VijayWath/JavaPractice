import java.util.*;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binary = sc.nextLong();
        int remainder = 0;
        int decimal = 0;
        long temp = binary;
        int i = 0;
        while (temp != 0) {
            remainder = (int) temp % 10;
            decimal = decimal + (remainder * (int) Math.pow(2, i));
            temp = temp / 10;
            i++;
        }
        System.out.println("Decimal " + decimal);
    }
}
