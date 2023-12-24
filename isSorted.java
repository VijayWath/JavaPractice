public class isSorted {
    public static boolean sorted(int arr[], int index) {
        if (index == arr.length-1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return sorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,6};
       System.out.println( sorted(arr, 0));
    }
}
