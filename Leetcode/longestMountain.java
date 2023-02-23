public class longestMountain {
    /*
    You may recall that an array arr is a mountain array if and only if:
    
    arr.length >= 3
    There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
    
    Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
    
    
    
    Example 1:
    
    Input: arr = [2,1,4,7,3,2,5]
    Output: 5
    Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
    
    Example 2:
    
    Input: arr = [2,2,2]
    Output: 0
    Explanation: There is no mountain.
    
    
    
    Constraints:
    
    1 <= arr.length <= 104
    0 <= arr[i] <= 104
    Follow up:
    
    Can you solve it using only one pass?
    Can you solve it in O(1) space?   
     */
    public static int longestMountain(int[] arr) {
        int current = 0;
        int previous = 0;
        int next = 0;
        int length = 0;
        int maxLength = length;
        for (int i = 1; i < arr.length-1; i++) {
            current = arr[i];
            previous = arr[i - 1];
            next = arr[i + 1];

            if((current > previous) && (next > current))
            {
                length++;
            }
            else if((current > next) && (previous > current))
            {
                length++;
            }
            else if((current > next) && (current > previous))
            {
                length++;
            }
            else if(((previous > current) && (i == arr.length-2)) || ((current > next) && (i == arr.length - 2)))
            {
                length++;
            }
            else
            {
                length = 0;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        //               1  2  3  4  5
        //                  1, 2, 3
        //               1< 4< 7> 3> 2
        //               0  1  2  3  4
        int[] arr = { 2, 1, 4, 7, 3, 2, 5 };
        int[] arr2 = { 2, 2, 2, };
        int[] arr3 = { 1, 2, 1 };
        //             0, 1, 2, 3, 4
        //             1< 2< 3> 2> 1
        //             0  1  2  3  4
        int[] arr4 = { 1, 2, 3, 2, 1 };
        int[] arr5 = { 0, 2, 0, 0, 2, 0, 2, 1, 1, 0, 2, 1, 0, 0, 1, 0, 2, 1, 2, 0, 1, 1, 0, 2, 2, 1, 2, 2, 0, 0, 0, 1,
                0, 2, 0, 0, 1, 2, 0, 1, 0, 2, 0, 2, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 1, 0, 2, 1, 2, 2, 1, 0, 0, 1, 0, 2, 0,
                0, 0, 2, 1, 0, 1, 2, 1, 0, 1, 0, 2, 1, 0, 2, 0, 2, 1, 1, 2, 0, 1, 0, 1, 1, 1, 1, 2, 1, 2, 2, 2, 0 };
        int[] arr6 = { 0, 1, 2, 0 };
        int[] arr7 = { 875, 884, 239, 731, 723, 685 };
        int[] arr8 = { 2, 3, 1, 2, 3, 4, 5, 6 };
        int[] arr9 = { 0 };
        int[] arr10 = { 1, 2, 3, 4, 5 };
        int[] arr11 = { 5, 4, 3, 2, 1 };
        int[] arr12 = { 0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };

        System.out.println(longestMountain(arr));
        System.out.println(longestMountain(arr2));
        System.out.println(longestMountain(arr3));
        System.out.println(longestMountain(arr4));
        System.out.println(longestMountain(arr5));
        System.out.println(longestMountain(arr6));
        System.out.println(longestMountain(arr7));
        System.out.println(longestMountain(arr8));
        System.out.println(longestMountain(arr9));
        System.out.println(longestMountain(arr10));
        System.out.println(longestMountain(arr11));
        System.out.println(longestMountain(arr12));


    }

}
/*
            System.out.println("The previous value is " + previous + " the current value is " + current
                    + " the next value is " + next + " the length of the mountain is " + length);

 */