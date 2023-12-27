public class path {
    public static int pathNo(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // movedownwards
        int downwards = pathNo(i + 1, j, n, m);
        // moveRight
        int right = pathNo(i, j + 1, n, m);
        int totalpath = downwards + right;
        return totalpath;
    }

    public static void main(String[] args) {
        int m = 3, n = 3;
        int NoOfPAths = pathNo(0, 0, n, m);
        System.out.println(NoOfPAths);

    }
}
