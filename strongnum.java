import java.util.*;

public class strongnum {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num, sum = 0, remainder = 0;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + factorial(remainder);
            temp = temp / 10;
        }
        if(sum == num){
            System.out.println("strong");
        }else{
            System.out.println("weak");
        }
    }
}
