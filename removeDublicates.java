public class removeDublicates {
    public static boolean[] map = new boolean[26];
    public static String newStr = "";

    public static void remove_duplicates(String str,int index){

        if(index == str.length()){
            System.out.println(newStr);
            return;
        }

        if(map[str.charAt(index) - 'a'] == true) {
            remove_duplicates(str, index+1);
        }else{
            newStr += str.charAt(index);
            map[str.charAt(index) - 'a'] = true;
            remove_duplicates(str, index+1);
        }

    }
    public static void main(String[] args) {
        String str = "adadadadadadad";
        remove_duplicates(str, 0); 
    }
}
