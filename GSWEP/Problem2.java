public class Problem2 {
    /*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    
    */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] arr2 = { 2, 3, 4, 1, 9, 333, 23, 0 };
        int target = 10;
        int[] indices = indices(arr, target);
        System.out.print(indices[0] + " " + indices[1]);
    }

    void selectionSort(int arr[]) {
        int pos;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) //find the index of the minimum element
                {
                    pos = j;
                }
            }

            temp = arr[pos]; //swap the current element with the minimum element
            arr[pos] = arr[i];
            arr[i] = temp;
        }
    }

    public static int[] indices(int[] arr, int target) {
        int length = arr.length;
        int head = 0;
        int tail = length - 1;
        int[] indices = { -1, -1 };
        while (tail - head > 0) {
            if (arr[head] + arr[tail] == target) {
                indices[0] = head;
                indices[1] = tail;
                return indices;
            }
            head++;
            tail--;
        }
        return indices;
    }

}
