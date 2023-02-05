import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumTotalTraingle {
    /*Given a triangle array, return the minimum path sum from top to bottom.
    
    For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
    
    Example 1:
    
    Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    Output: 11
    Explanation: The triangle looks like:
    2
    3 4
    6 5 7
    4 1 8 3
    The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
    
    Example 2:
    
    Input: triangle = [[-10]]
    Output: -10
    
    Constraints:
    
    1 <= triangle.length <= 200
    triangle[0].length == 1
    triangle[i].length == triangle[i - 1].length + 1
    -104 <= triangle[i][j] <= 104
    Follow up: Could you do this using only O(n) extra space, where n is the total number of rows in the triangle? */
    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0;
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int i = triangle.size() - 1; i >= 0; i--) {
            if (i == triangle.size() - 1) {
                for (int j = 0; j < triangle.get(triangle.size() - 1).size(); j++) {
                    if (triangle.get(triangle.size() - 1).get(j) < min) {
                        min = triangle.get(triangle.size() - 1).get(j);
                        index = j;
                    }

                }
                sum += min;
            } else {
                min = Math.min(triangle.get(i).get(index - 1), triangle.get(i).get(index));
                index = triangle.get(i).get(index - 1) >= triangle.get(i).get(index) ? index : index - 1;

            }

        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        List<Integer> b = new ArrayList<>();
        b = Arrays.asList(2);
        List<Integer> c = new ArrayList<>();
        c = Arrays.asList(3, 4);
        List<Integer> d = new ArrayList<>();
        d = Arrays.asList(6, 5, 7);
        List<Integer> e = new ArrayList<>();
        e = Arrays.asList(4, 1, 8, 3);
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);
        System.out.println(minimumTotal(a));

    }
}
