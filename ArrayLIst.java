import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        System.out.println(list.get(2));

        list.add(1,2);

        System.out.println(list.get(1));
        
    }
}
