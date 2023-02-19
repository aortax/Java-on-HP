public class findLengthOfLCIS {
    /*
    
    Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.
    
    A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].
    
    
    
    Example 1:
    
    Input: nums = [1,3,5,4,7]
    Output: 3
    Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
    Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
    4.
    
    Example 2:
    
    Input: nums = [2,2,2,2,2]
    Output: 1
    Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
    increasing.
    
    
    
    Constraints:
    
    1 <= nums.length <= 104
    -109 <= nums[i] <= 109
     */
    public static int findLengthOfLCIS(int[] nums) {
        int length = 1; // well length will be 1 regardless
        int maxLength = length; // we will set maxLength same as length at first
        for (int i = 1; i < nums.length; i++) { // we start at 1 and will automatically exit if nums.length == 1
            int previous = nums[i - 1]; // previous value
            int current = nums[i]; // current value
            if (current > previous) { // we need to be larger than previous value
                length++;
            } else { // otherwise reset
                length = 1;
            }
            if (maxLength < length) { // now what we do is adjust maxLength value
                maxLength = length;
            }

        }
        return maxLength; // return maxLength
    }

    public static int findLengthOfDCIS(int[] nums)
    {
        int l = 1;
        int m = l;
        for(int i = 1; i < nums.length; i++)
        {
            int p = nums[i - 1];
            int c = nums[i];

            if (p > c) {
                l++;
            } else {
                l = 1;
            }
            if (l > m) {
                m = l;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        // int l = 0;
        // int r = nums.length - 1;

        int[] a = { 1, 3, 5, 4, 7 };
        int[] a1 = { 2, 2, 2, 2, };
        int[] a2 = { 2, 1, 4, 7, 3, 2, 5 };
        System.out.println(findLengthOfLCIS(a));
        System.out.println(findLengthOfLCIS(a1));
        System.out.println(findLengthOfLCIS(a2));
        System.out.println(findLengthOfDCIS(a));
        System.out.println(findLengthOfDCIS(a1));
        System.out.println(findLengthOfDCIS(a2));


    }
}
