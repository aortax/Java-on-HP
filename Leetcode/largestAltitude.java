import java.util.Arrays;

/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

Constraints:

    n == gain.length
    1 <= n <= 100
    -100 <= gain[i] <= 100
 */
public class largestAltitude {
    public static int largestAltitude(int[] gain) {

        int[] a = new int[gain.length + 1]; // Length is 1 more than original array
        a[0] = 0; // Definition
        int max = a[0]; // We set 0 as max so far
        for (int i = 1; i <= gain.length; i++) { // Ok we run the length of the original array
            a[i] += a[i - 1] + gain[i - 1]; // For the first value it will be value before in this array + index -1 from original array added
            max = Integer.max(max, a[i]); // update the max value
        }
        return max; // return the max value
    }

    public static void main(String[] args) {
        int[] a = { -5, 1, 5, 0, -7 };
        largestAltitude(a);
        System.out.println(largestAltitude(a));
    }
    //        System.out.println(Arrays.toString(a));

    //        System.out.println(Arrays.toString(gain));

}