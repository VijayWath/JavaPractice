public class CallPeople {

    public static int NoOfWays(int n) {
        if(n <= 1){
            return 1;
        }
        int single = NoOfWays(n - 1);
        int pair = (n - 1) * NoOfWays(n - 2);
        return single+pair;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(NoOfWays(n));
    }
}
