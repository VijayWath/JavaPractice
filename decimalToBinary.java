import java.util.*;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int temp = decimal, octal = 0, remainder = 0, binary = 0, i = 0;
        while (decimal != 0) {
            remainder = decimal % 2;
            binary = binary + (remainder * (int) Math.pow(10, i));
            decimal = decimal / 2;
            i++;
        }
        i = 0;
        System.out.println("Binary " + binary);
        while (temp != 0) {
            remainder = temp % 8;
            octal = octal + (remainder * (int) Math.pow(10, i));
            temp = temp / 8;
            i++;
        }
        System.out.println("Octal " + octal);
    }
}
