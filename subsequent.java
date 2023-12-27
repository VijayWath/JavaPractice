public class subsequent {
    public static void StringSubsequence(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(index);
        // include

        StringSubsequence(str, index + 1, newString + currchar);
        // not include
        StringSubsequence(str, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        StringSubsequence(str, 0, "");
    }
}
