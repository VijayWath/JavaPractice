public class rec1 {
    public static void num(int n,int i,int sum) {
    
        if (i == n+1) {
            System.out.println(sum);
            return;
        }
        
        sum +=i;
        num(n,i+1,sum);
        System.out.println(i);
    }

    public static void main(String[] args) {
        num(5,1,0);
    }

}
