public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 9, -1, -3 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static int[] bubbleSort(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
