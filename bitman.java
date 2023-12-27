public class bitman {
    public static void main(String[] args) {
        //get
        // int n =5;
        // int pos = 3;
        // int bitMask =1 << pos;
        // if((bitMask & n)==0){
        //     System.out.println("bit is 0");
        // }else{
        //     System.out.println("bit is 1");
        // }
        
        //set
        int n =5;
        int pos = 1;
        int bitMask =1 << pos;
        int num = bitMask | n;
        System.out.println(num);

    }
}
