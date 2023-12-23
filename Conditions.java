import java.util.*;

public class Conditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter values of a and b resp.");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b) {
      System.out.println("a is bigger");
    }

    else if (a == b) {
      System.out.println("Equal");
    }

    else {
      System.out.println("b is bigger");
    }
  }
}