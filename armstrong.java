import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int remender = 0;
        int result = 0;
        int temp = num;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        temp = num;
        while (temp != 0) {
            remender = temp % 10;
            result = result + (int) Math.pow(remender, count);
            temp = temp / 10;
        }
        if (result == num) {
            System.out.println("Amgstrom");
        } else {
            System.out.println("not amgstrom");
        }

    }
}
