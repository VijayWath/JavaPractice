public class backtracking {
    public static void printPermutations(String str, String permutations, int index) {
        if (str.length() == 0) {
            System.out.println(permutations);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newString, permutations + str.charAt(i), index + 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str, "", 0);
    }
}
