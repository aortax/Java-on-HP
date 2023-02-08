import java.util.Arrays;

public class getMaximumGenerated {
    /*You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
    
    nums[0] = 0
    nums[1] = 1
    nums[2 * i] = nums[i] when 2 <= 2 * i <= n
    nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
    
    Return the maximum integer in the array nums​​​.
    
    Example 1:
    
    Input: n = 7
    Output: 3
    Explanation: According to the given rules:
    nums[0] = 0
    nums[1] = 1
    nums[(1 * 2) = 2] = nums[1] = 1
    nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
    nums[(2 * 2) = 4] = nums[2] = 1
    nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
    nums[(3 * 2) = 6] = nums[3] = 2
    nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
    Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.
    
    Example 2:
    
    Input: n = 2
    Output: 1
    Explanation: According to the given rules, nums = [0,1,1]. The maximum is max(0,1,1) = 1.
    
    Example 3:
    
    Input: n = 3
    Output: 2
    Explanation: According to the given rules, nums = [0,1,1,2]. The maximum is max(0,1,1,2) = 2.
    
    
    
    Constraints:
    
    0 <= n <= 100 */
    public static int getMaximumGenerated(int n) {
        int[] a = new int[n + 1];
        a[0] = 0;
        int max = a[0];
        for (int i = 0; i < (n + 1); i++) {
            if (i == 1) {
                a[1] = 1;
            }
            if ((2 <= (2 * i)) && (2 * i <= n)) {
                a[2 * i] = a[i];
            }
            if (2 <= (2 * i + 1) && ((2 * i + 1) <= n)) {
                a[2 * i + 1] = a[i] + a[i + 1];
            }
            max = Integer.max(max, a[i]);
        }
        return max;
    }
    //        System.out.println(Arrays.toString(a));

    public static void main(String[] args) {
        System.out.println(getMaximumGenerated(7));
    }

}
