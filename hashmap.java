import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        // int[] arr1 = {7,3,9};
        // int[] arr2 = {6,3,9};
        // HashMap<Integer,Integer> map = new HashMap<>();

        // for(int x : arr){
        // if(!map.containsKey(x)){
        // map.put(x,1);
        // }else{
        // int freq = map.get(x);
        // map.put(x,(freq+1));
        // }
        // }
        // System.out.println(map);

        // HashSet<Integer> set = new HashSet<>();
        // HashSet<Integer> intSet = new HashSet<>();
        // for(int x : arr1){
        // set.add(x);
        // }
        // for(int x : arr2){
        // if(set.contains(x)){
        // intSet.add(x);
        // }
        // }
        // System.out.println(intSet.size());
        // for (Integer integer : intSet) {
        // System.out.println(integer);
        // }

        HashMap<String, String> tickMap = new HashMap<>();
        HashMap<String, String> revMap = new HashMap<>();

        tickMap.put("ch", "ban");
        tickMap.put("mum", "del");
        tickMap.put("goa", "ch");
        tickMap.put("del", "goa");
            // from To
            // To from 
        for (String key : tickMap.keySet()) {
            revMap.put((tickMap.get(key)), key);
        }

        String start="";

        for(String key : tickMap.keySet()){
            if(!revMap.containsKey(key)){
                start = key;
            }
        }

        while (tickMap.containsKey(start)) {
            System.out.print(start+">");
            start = tickMap.get(start);
        }
        System.out.print(start);
    }
}
