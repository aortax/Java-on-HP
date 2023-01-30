public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int[] height2 = { 1, 1 };
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
    }

    /*
     * You are given an integer array height of length n. There are n vertical lines
     * drawn such that the two endpoints of the ith line are (i, 0) and (i,
     * height[i]).
     * 
     * Find two lines that together with the x-axis form a container, such that the
     * container contains the most water.
     * 
     * Return the maximum amount of water a container can store.
     * 0 1 2 3 4 5 6 7 8
     * Input: height = [1,8,6,2,5,4,8,3,7]
     * Output: 49
     * Explanation: The above vertical lines are represented by array
     * [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
     * container can contain is 49.
     * 
     * Input: height = [1,1]
     * Output: 1
     */
    public static int maxArea(int[] height) {
        int areaMax = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 1; j < height.length; j++) {
                int l = j - i;
                int h = height[i] < height[j] ? height[j] : height[i];
                areaMax = areaMax < (l * h) ? (l * h) : areaMax;
            }
        }
        return areaMax;
    }
}
