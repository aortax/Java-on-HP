public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int[] nums2 = { 0 };
        int[] nums3 = { 0, 1, 2, 3, 4 };
        moveZeroes(nums);
        System.out.println();
        moveZeroes(nums2);
        System.out.println();
        moveZeroes(nums3);
    }

    /*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    
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
    public static void moveZeroes(int[] nums) {
        int length = nums.length; // Length of the array
        int numberOfZeros = 0; // Number of zeros we have
        int index = 0; // The index of the array we are at
        if (length == 0 || length == 1) // If the length is zero or one we do nothing
        {
            return;
        }
        for (int i : nums) { // For each of the numbers
            /*
            *  Index 0 1 2 3 4
            *  Input 0 1 2 3 4
            Output   1 2 3 4 0 
            So what we do here is move forward by one everything if there is a zero basically 
             */
            if (i == 0) {
                numberOfZeros++;
            } else {
                nums[index - numberOfZeros] = i;
            }
            index++; // move the index forward
        }
        for (int j = 0; j < numberOfZeros; j++) {
            nums[length - 1 - j] = 0;
        }
    }

}
