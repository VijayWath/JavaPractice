public class selectionSort {

    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestTndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestTndex] > arr[j]) {
                   smallestTndex = j;
                }
            }
            int temp = arr[smallestTndex];
            arr[smallestTndex] = arr[i];
            arr[i] = temp;
        }
    }
}
