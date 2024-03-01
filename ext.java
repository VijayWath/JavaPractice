import java.io.*;
import java.util.*;

 class ext {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ill = "!,?._'@1234567890";
        char[] illegal = ill.toCharArray();
        String s = scan.nextLine().trim(); 
        if(s.contains(" ")){
            // Write your code here.
        for (char x : illegal) {
            s = s.replace(x, ' ');
        }
        String[] arr = s.split("\\s+"); 
        System.out.println(arr.length);
        for (String x : arr) {
            System.out.println(x);
        }
        }else{
            System.out.println("0");
        }

        scan.close();
    }
}