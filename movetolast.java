public class movetolast {
    public static String newString = "";
    public static int count = 0;

    public static void moveToLast(String str,char element,int index){
        if(index == str.length()-1){
            for(int i = 0;i<count;i++){
                newString +=element;
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(index) == element){
            count++;
            moveToLast(str, element, index+1);
        }else{
            newString +=str.charAt(index);
            moveToLast(str, element, index+1);
        }
    }
public static void main(String[] args) {
    String str = "axbcxxd";
    moveToLast(str, 'x', 0);
}
}
