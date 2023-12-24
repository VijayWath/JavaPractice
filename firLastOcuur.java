public class firLastOcuur {
    public static int first = -1;
    public static int last = -1;

    public static void FindOcuurance(String str,char element,int Index){
        if(Index < 0){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(Index) == element){
            if(first == -1){
                first = Index;
            }else{
                last = Index;
            }
        }
        FindOcuurance(str, element, Index-1);
    }
    public static void main(String[] args) {
        String str = "cahjuvghaioughial";
        FindOcuurance(str, 'a', str.length()-1);
    }
}
