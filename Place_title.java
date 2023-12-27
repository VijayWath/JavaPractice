public class Place_title {
    public static int NoOfWays(int m, int n) {
        if(n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int horizaontal = NoOfWays(m, n - 1);
        int vertical = NoOfWays(m, n - m);
        return horizaontal + vertical;

    }

    public static void main(String[] args) {
        int m =2,n= 4;
        System.out.println(NoOfWays(m, n));
    }
}
