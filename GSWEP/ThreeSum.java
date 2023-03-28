import java.util.*;

public class ThreeSum {
    /*
    Given an array and a value, find if there is a triplet in array whose sum is equal to the given value. If there is such a triplet present in array, then print the triplet and return true. Else return false.
     */
    // Time complexity - is n ^ 3 where n is the length of the array 
    // Space complexity is n as only use n amount of extra space max in the HashSet, where n is the length of the array

    public static void main(String[] args) {
        int arr[] = { 2, 9, 45, 19, 10, 9 };
        int target = 28;
        
        int[] indices = new int[3];

        indices = indices(arr, target);
        for (int i = 0; i < 3; i++) {
            System.out.print(indices[i] + " ");
        }
    }

    public static int[] indices(int[] arr, int target) {
        int length = arr.length; // get the length of the array
        int[] noMatch = { -1, -1, -1 }; // make the array for the return
        int[] match = new int[3];

        // Loop all over the array except for the last index
        for (int i = 0; i < length - 2; i++) {
            // make a new HashSet
            HashSet<Integer> h = new HashSet<Integer>();
            // Will look for pair now with value difference of target - a[i]
            int sumHere = target - arr[i];
            // Well we need to look for everything after this i value tll end of the array
            for (int j = i + 1; j < length; j++) {
                // If it contains the difference already of sumHere - a[j]
                if (h.contains(sumHere - arr[j])) {
                    // return the result
                    int t = sumHere - arr[j];
                    match[0] = i;
                    match[1] = j;
                    match[2] = matchIndex(arr, t);
                    Arrays.sort(match);
                    return match;
                }
                h.add(arr[j]); // now need to add it to hashset
            }
        }
        // if no match is found
        return noMatch;
    }

    public static int matchIndex(int[] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            if (t == arr[i]) {
                return i;
            }
        }
        return -1;
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

}