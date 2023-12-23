import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // marks[0]=69;
        // marks[2]=45;
        // marks[1]=01;
        // System.out.println(marks[0]);
        // System.out.println(marks[3]);

        System.out.println("enter values");
        for (int j = 0; j < size; j++) {
            numbers[j] = sc.nextInt();

        }
        System.out.println("enter number to search");
        int x = sc.nextInt();

        for (i = 0; i < size; i++) {
            if (numbers[i] == x) {
                break;
            }
        }

        if (i >= size) {
            System.out.println("Invalid");
        } else {
            System.out.print("number is found on index " + (i + 1));
        }

    }
}
