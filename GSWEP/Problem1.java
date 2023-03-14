import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Problem1 {
    /* Given a 2d array convert it into a 1d array and sort it  */
    public static void main(String[] args) {
        // // We will first instantiate the array
        // int[][] arr1 = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        // int[][] arr2 = { { 1, 4, 5, 9, 2, 3, 0, -11, 23, 2293, 293 }, { 1, 3, 4, 2443, 99 },
        //         { 2, 6, 44, 555555, 3332 } };

        // // Make the  array list the first one will be for input 
        // ArrayList<Integer> input = new ArrayList<>();

        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr1[i].length; j++) {
        //         input.add(arr1[i][j]);
        //     }
        // }
        // Collections.sort(input);
        // System.out.println(input);

        int[][] arr1 = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        int lengthOfList = arr1.length;
        int[] lengthOfSubLists = new int[lengthOfList];
        for(int i = 0; i < lengthOfList; i ++)
        {
            lengthOfSubLists[i] = arr1[1].length;
        }
        int counter1 = 0;
        int counter2 = 0;
        
        // Find the total length of the 1D array
        int totalLength = 0;
        for (int i = 0; i < arr1.length; i++) {
            totalLength += arr1[i].length;
        }
        // // Initialize the 1D array
        // int[] arr2 = new int[totalLength];

        // // Merge the nested arrays into the 1D array using a merge sort algorithm
        // int[] pointers = new int[arr1.length]; // Pointers to keep track of the current index in each nested array
        // for (int i = 0; i < totalLength; i++) {
        //     int minValue = Integer.MAX_VALUE;
        //     int minIndex = -1;
        //     for (int j = 0; j < arr1.length; j++) {
        //         if (pointers[j] < arr1[j].length && arr1[j][pointers[j]] < minValue) {
        //             minValue = arr1[j][pointers[j]];
        //             minIndex = j;
        //         }
        //     }
        //     arr2[i] = minValue;
        //     pointers[minIndex]++;
        // }

        // // Print the resulting 1D array
        // System.out.println(Arrays.toString(arr2));
    }
}

/*
So we have these in a semi sorted form, but the issue I have understanding here is that when we will for example sort the 1st index of the first array, we will get 1,1,2
The issue I am having here is if we then look at the second index, we get 3,4,6
The third index wil be 4,5
We see in the second array we will have 6 be greater than the values present in third array
How will we deal with this.

How to possibly program this out 

What can be done is that 

I will make a large number and set up a break
 */