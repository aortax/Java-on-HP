import java.util.ArrayList;
import java.util.Collections;

public class Problem1 {
    /* Given a 2d array convert it into a 1d array and sort it  */
    public static void main(String[] args) {
        // We will first instantiate the array
        int[][] arr1 = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int[][] arr2 = { { 1, 4, 5,9,2,3,0,-11,23,2293,293 }, { 1, 3, 4,2443,99 }, { 2, 6,44,555555,3332 } };

        // Make the  array list the first one will be for input 
        ArrayList<Integer> input = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                input.add(arr1[i][j]);
            }
        }
        Collections.sort(input);
        System.out.println(input);
    }
}