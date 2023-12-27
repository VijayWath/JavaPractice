public class permutationsofstring {
    public static void Permutations(String str,String permutation ){
        if(str.length() == 0){
            System.err.println(permutation);
            return;
        }
        for(int i = 0;i<str.length();i++){
            char currchar = str.charAt(i);
            String  newString = str.substring(0,i) + str.substring(i+1);
            Permutations(newString, permutation + currchar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Permutations(str, "");
    }
}