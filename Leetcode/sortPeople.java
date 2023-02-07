import java.util.ArrayList;

public class sortPeople {
    /*You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
    
    For each index i, names[i] and heights[i] denote the name and height of the ith person.
    
    Return names sorted in descending order by the people's heights.
    
    
    
    Example 1:
    
    Input: names = ["Mary","John","Emma"], heights = [180,165,170]
    Output: ["Mary","Emma","John"]
    Explanation: Mary is the tallest, followed by Emma and John.
    
    Example 2:
    
    Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
    Output: ["Bob","Alice","Bob"]
    Explanation: The first Bob is the tallest, followed by Alice and the second Bob. */
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i = 0; i < heights.length-1; i++)
        {
            for (int j = 0; j < heights.length - 1-i; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j + 1];
                    heights[j + 1] = heights[j];
                    heights[j] = temp;

                    String name1 = names[j+1];
                    names[j+1] = names[j];
                    names[j] = name1;
                }
            }
        }
        return names;
    }

}
