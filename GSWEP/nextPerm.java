/*
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.
 */

public class nextPerm {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6 };
        nextPerm(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] nextPerm(int[] a) {
        int len = a.length;
        if (len <= 1) {
            return a;
        }
        // Find the pair most to the right such that (i,i+1) has a[i] < a[i+1]
        int rMost = a.length - 2;
        while (rMost >= 0 && a[rMost] >= a[rMost + 1]) {
            rMost--;
        }
        // If such a pair is found now
        if (rMost > 0) {
            // Find now the next smallest element greater than a[i] on right side of the array
            int nextSmall = a.length - 1;
            while (nextSmall > rMost && a[nextSmall] <= a[rMost]) {
                nextSmall--;
            }
            // Now swap the two values

            swap(a, rMost, nextSmall);

        }
        // Let's reverse the elements in array after index rMost to get next perm

        int left = rMost + 1; // pivot point
        int right = a.length - 1; // our array last index

        while (left < right) {
            int t = a[left];

            a[left] = a[right];
            a[right] = t;
            left++;
            right--;
        }

        return a;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

// public static void reverseSort(int[] array, int start, int end) {
//     if (start < 0 || end >= array.length || start >= end) {
//         return;
//     }

//     for (int i = start; i <= (start + end) / 2; i++) {
//         int temp = array[i];
//         array[i] = array[start + end - i];
//         array[start + end - i] = temp;
//     }
// }