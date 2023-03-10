public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        selectionSort(intArray);
        System.out.println();
        for (int i : intArray) {
            System.out.print(i + " ");
        }

    }

    public static int[] selectionSort(int[] a) {
        int min = Integer.MAX_VALUE; // max value of int
        int l = a.length; // length of array
        for (int h = 0; h < l; h++) { // outer loop of the array 
            int c = 0; // we will take note of index where min is
            for (int i = h; i < l; i++) { // Now inner loop starting from place where we have our current min
                if (a[i] < min) { // if we have a new minimum value assign it to min, and then also assign c that i value
                    min = a[i];
                    c = i;
                }
            }
            int v = a[h]; // first get the value of h
            a[h] = min;
            a[c] = v;
            // reset min value
            min = Integer.MAX_VALUE;
        }
        return a; // return index
    }
}