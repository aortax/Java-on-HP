import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    /*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
    
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
        
    Example 1:
    
    Input: rowIndex = 3
    Output: [1,3,3,1]
    
    Example 2:
    
    Input: rowIndex = 0
    Output: [1]
    
    Example 3:
    
    Input: rowIndex = 1
    Output: [1,1]
    
    Constraints:
    
    0 <= rowIndex <= 33
    Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?    */
    public static List<Integer> getRow(int rowIndex) {
        // Make a new list
        List<Integer> list = new ArrayList<Integer>();
        // Run it through for at least for desired # of row times i.e you put in 0 you will get 1 row
        for (int i = 0; i < rowIndex + 1; i++) {
            // Adds a 1 to the front of the list
            list.add(0, 1);
            // Now this 1 which was inserted will move towards the back
            for (int j = 1; j < list.size() - 1; j++) {
                // From index 1 we will get element of list right now and next to it and sum it as new element at this index
                list.set(j, list.get(j) + list.get(j + 1)); // We end before end of list to keep the one at the end 
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> result = getRow(3);
        System.out.print(result);
    }
}
