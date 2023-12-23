public class rec2 {
    public static int fac(int n) {
        if (n == 1) {
            
            return 1;
        }
        int fac_n_1 = fac(n - 1);
        int fac_n = n * fac_n_1;
        return fac_n;
    }

    public static void main(String[] args) {
       int fact =  fac(3);
       if(fact == 1){
        System.out.println("1");
       }
       else{
        System.out.println(fact);
       }
    }

}
