public class ext {
    public static void main(String[] args) {
        String str = "abs";
        for (int i = 0; i < str.length(); i++) {
            String newString = str.substring(0, i) + "G" + str.substring(i + 1);
            System.out.println(newString);
        }
    }
}
