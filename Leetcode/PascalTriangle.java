import java.util.*;

public class PascalTriangle {
    /*Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    
    Example 1:
    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    Example 2:
    
    Input: numRows = 1
    Output: [[1]]
    Constraints:
    1 <= numRows <= 30 */
    public List<List<Integer>> generate(int numRows) {
        // make a list with a list nested inside first. 
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        // Now we will run a for loop for the rows
        for (int i = 0; i < numRows; i++) {
            // Make a list which will contain all the row values
            List<Integer> row = new ArrayList<Integer>();
            // now a loop to get the row values. Will be less than i+1 as in 0th row there will be 1 value and 2 for 1th row and so on
            for (int j = 0; j < i + 1; j++) {
                // if we are at the start or end of the row the value will be 1
                if (j == 0 || j == i) {
                    row.add(1);
                    // The value will be previous rows same index value -1 + previous row same index value for current rows index value
                } else {
                    row.add((triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j)));
                }
            }
            // add the row to the list of lists
            triangle.add(row);
        }
        // return the triangle 
        return triangle;
    }

    public static void main(String[] args) {

    }

}
