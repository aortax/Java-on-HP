import java.util.ArrayList;
import java.util.Arrays;

public class NSum {
    // Given an array without duplicates of integers, which is sorted ( well after you sorted it yourself), we want to find the values which will add up to the target value. 
    // Way this is done is is through N values, ranging from 2 to the size of the array. Assume the size of the array here will be up to 100, and N sum goes to 100
    // You only need to give us one possible solution
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26 };
        Arrays.sort(arr);
        int target = 50;
        int len = arr.length;
        return NSum(arr, target, 4, 0);
    }

    public ArrayList<ArrayList<Integer>> NSum(int[] arr, int target, int n, int index) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int len = arr.length;
        if (len <= index) {
            return ans;
        }
        if (n == 2) {
            int i = index;
            int j = len - 1;
            while (i < j) {
                if (target - arr[i] == arr[j]) {
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(arr[i]);
                    t.add(arr[j]);
                    ans.add(t);
                    while (i < j && arr[i] == arr[i + 1]) {
                        i++;
                    }
                    while (i < j && arr[j - 1] == arr[j]) {
                        j--;
                    }
                    i++;
                    j--;
                } else if (target - arr[i] > arr[j]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
    }
}
