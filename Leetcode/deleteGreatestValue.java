import java.util.*;

public class deleteGreatestValue {
    /*You are given an m x n matrix grid consisting of positive integers.
    
    Perform the following operation until grid becomes empty:
    
    Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
    Add the maximum of deleted elements to the answer.
    
    Note that the number of columns decreases by one after each operation.
    
    Return the answer after performing the operations described above.
    
    
    
    Example 1:
    
    Input: grid = [[1,2,4],[3,3,1]]
    Output: 8
    Explanation: The diagram above shows the removed values in each step.
    - In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
    - In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
    - In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
    The final answer = 4 + 3 + 1 = 8.
    
    Example 2:
    
    Input: grid = [[10]]
    Output: 10
    Explanation: The diagram above shows the removed values in each step.
    - In the first operation, we remove 10 from the first row. We add 10 to the answer.
    The final answer = 10.
    
    
    
    Constraints:
    
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 50
    1 <= grid[i][j] <= 100  */
    public static int deleteGreatestValue(int[][] grid) {
        // First sort this array which will now have all the largest amounts toward the right of the array for each row
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]); // Called on Arrays.sort to each row 
        }
        int total = 0; // Now we will the total value initialized outside the array
        for (int i = grid[0].length - 1; i >= 0; i--) { // We will run the row value first to run all of them and for each row value we compare column value
            int max = 0; // max will be reset after entire row is run
            for (int j = 0; j < grid.length; j++) // Now run each column through
            {
                max = Integer.max(max, grid[j][i]); // get the max value
            }
            total += max; // add the max value to total
        }
        return total; // return the total amount
    }
    //        Comments which were used to test the values while trouble shooting
    //        System.out.println("The length of the grid is " + grid.length);
    //        System.out.println("The length of the grid[k] is " + grid[k].length);
    //        System.out.println("The k value is " + k + " The i value is " + i + " the max is " + max);
    //        System.out.println(max);
    //        max = Integer.max(max, grid[i][grid[i].length - k - i]);
    //        grid[i][grid[i].length - k-1] = 0;

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 4 }, { 3, 3, 1 } };
        System.out.println(deleteGreatestValue(a));
    }
    // public int deleteGreatestValue(int[][] grid) {
    //     int t = 0; // sum of the largest removed
    //     for(int a = 0; a < grid.length;a++) // gotta keep running and removing one at a time so ends up as array.length -1
    //     {
    //         int m = 0; // largest run over entire array
    //         for (int i = 0; i < grid.length; i++) { // we run through the array
    //             int max = 0; // the largest inside each row
    //             int x = 0; // x index
    //             int y = 0; // y index
    //             for (int j = 0; j < grid[i].length; j++) { // now get max of this row
    //                 if (grid[i][j] > max) {
    //                     max = grid[i][j];
    //                     x = i;
    //                     y = j;
    //                 }
    //                 if(j == grid[i].length-1) // mark the max now as 0 once you went through the row
    //                 {
    //                     grid[x][y] = 0;
    //                 }
    //             }
    //             m = Integer.max(m, max); // get max value
    //         }   
    //         t = t + m;
    //     }
    //     return t;
    // }

}
/*
 * Leetcode won't let me post the solution for this only sadly, even though I really liked it
    # Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
Well first way I thought of doing this was sorting out everything so it becomes easier to see, but that ended up being smarter idea anyow. Remember we want to sort each row and then compare the same column value of each row to get max of this vertical amount

After that we will run the row loop outside first as we will be keeping them constant and inner loop for the columns as they will be amounts we change. 
# Approach
<!-- Describe your approach to solving the problem. -->
First sort - > then compare each column value from right to left.
# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
I believe the sort for java is n log n , and then 2 for loops will roughly have n log n * n * m

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->
Not really relevant here as we don't make many changes.
# Code
```
class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        int total = 0;
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int max = 0;
            for(int j = 0; j <grid.length;j++)
            {
                max = Integer.max(max, grid[j][i]);
            }
            total += max;
        }
        return total;

    }
}
```
 */