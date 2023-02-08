public class flipAndInvertImage {
    /*Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
    
    To flip an image horizontally means that each row of the image is reversed.
    
    For example, flipping [1,1,0] horizontally results in [0,1,1].
    
    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
    
    For example, inverting [0,1,1] results in [1,0,0].
    
    Example 1:
    
    Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    Output: [[1,0,0],[0,1,0],[1,1,1]]
    Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
    
    Example 2:
    
    Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
    Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
    Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
    Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]    
    
    Constraints:
    
    n == image.length
    n == image[i].length
    1 <= n <= 20
    images[i][j] is either 0 or 1.
    */
    public static int[][] flipAndInvertImage(int[][] image) {
        // Run each row first
        for (int i = 0; i < image.length; i++) {
            // Run each row now
            // get the middle value
            int length = image[i].length;
            int mid = length / 2;
            for (int j = 0; j < mid; j++) {
                // What we need to do is move left index to the right
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;

                // Now invert the value so a 1 equal to 0 and and 0 is equal to 1

                image[i][j] = image[i][j] == 1 ? 0 : 1;
                image[i][image[i].length - 1 - j] = image[i][image[i].length - 1 - j] == 0 ? 1 : 0;
            }
            // Do the mid
            if (length % 2 != 0) {
                image[i][mid] = image[i][mid] == 0 ? 1 : 0;
            } else {
                image[i][mid] = image[i][mid] == 0 ? 1 : 0;
                image[i][length - mid] = image[i][length - mid] == 0 ? 1 : 0;

            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
    }

}
