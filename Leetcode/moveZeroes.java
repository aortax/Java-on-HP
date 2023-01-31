public class moveZeroes {
    /*
     * 283. Move Zeroes
    Easy
    12.5K
    317
    Companies
    
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    
    Note that you must do this in-place without making a copy of the array.
    
    Example 1:
    
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    
    Example 2:
    
    Input: nums = [0]
    Output: [0]
    
    Constraints:
    
    1 <= nums.length <= 104
    -231 <= nums[i] <= 231 - 1
    
    
    Follow up: Could you minimize the total number of operations done?
     */
    public void moveZeroes(int[] nums) {
        int length = nums.length; // Length of the array
        int numberOfZeros = 0; // Number of zeros we have
        int index = 0; // The index of the array we are at
        if (length == 0 || length == 1) // If the length is zero or one we do nothing
        {
            return;
        }
        for (int i : nums) { // For each of the numbers
            if (i == 0) { // If a number is equal to zero
                int valueAtEnd = nums[length - 1 - numberOfZeros]; // Get the number from the right edge of the array adjusted for zeros removed.
                nums[index] = valueAtEnd;  // Switch to end value
                nums[length - 1 - numberOfZeros] = 0; // Set the other side value to zero
                numberOfZeros++; // Increase number of zeros
            }
            index++; // move the index forward
        }
    }

}
