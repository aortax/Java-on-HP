public class BinarySearch {
    /*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    
    You must write an algorithm with O(log n) runtime complexity.
    
    Example 1:
    
    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
    
    Example 2:
    
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1
    
    Constraints:
    
    1 <= nums.length <= 104
    -104 < nums[i], target < 104
    All the integers in nums are unique.
    nums is sorted in ascending order. */
    public int search(int[] nums, int target) {
        int left = 0; // Left extreme 
        int right = nums.length - 1; // Right extreme
        int mid = (left) + (right - left) / 2; // The middle index
        int answer = -1; // We can not find the number
        while(left <= right) // Basically we need a range to do our search
        {
            if(nums[mid] == target)
            {
                return answer = mid; // If we get match
            }
            else if(nums[mid] > target) // If our midpoint is greater than target
            {
                right = mid - 1;
                mid = (left) + (right - left) / 2;
            } 
            else // If our midpoint is less than target
            {
                left = mid + 1;
                mid = (left) + (right - left) / 2;
            }
        }
        return answer; // If we don't find
    }

    public static void main(String[] args) {
        int[] a = { -1, 0, 3, 5, 9, 12 };
        int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    }
}
