public class reverseString {
    public static void printRev(String str,int index){
        if(index <0){
            return;
        }
        System.out.println(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main(String[] args) {
        String str = "dnul";
        printRev(str, str.length()-1);
    }
}
