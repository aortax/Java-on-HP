import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Problem1 {
    /* Given a 2d array convert it into a 1d array and sort it. The inner arrays are sorted in ascending oder. The arrays are not necessarily the same size  */
    public static void main(String[] args) {
        // We will first instantiate the array

        int[][] arr1 = { { 1, 4, 5 }, { 1, 3, 4 }, { 2, 6 } };
        // int[][] arr1 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 1, 2, 3, 4, 9, 99, 1234 },
        //         { 9, 99, 230, 250, 987, 12304 } };

        int lengthOfList = arr1.length;

        int[] innerArrayLength = new int[lengthOfList];
        innerArrayLength = inenrArrayLength(arr1, innerArrayLength);
        int totalLength = totalLengthOfList(arr1);
        int maxInnerArrayLength = maxInnerArrayLength(arr1);

        int mergedArray[] = merge(arr1, lengthOfList, maxInnerArrayLength, totalLength);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }

    public static int[] inenrArrayLength(int[][] arr1, int[] innerArrayLength) {
        for (int i = 0; i < arr1.length; i++) {
            innerArrayLength[i] = arr1[i].length;
        }
        return innerArrayLength;
    }

    public static int maxInnerArrayLength(int[][] arr1) {
        int maxInnerArrayLength = 0;
        for (int i = 0; i < arr1.length; i++) {
            maxInnerArrayLength = maxInnerArrayLength > arr1[i].length ? maxInnerArrayLength : arr1[i].length;
        }
        return maxInnerArrayLength;

    }

    public static int totalLengthOfList(int[][] arr1) {
        int lengthOfList = arr1.length;
        int totalLength = 0;
        for (int i = 0; i < lengthOfList; i++) {
            totalLength += arr1[i].length;
        }
        return totalLength;
    }

    public static int[] merge(int[][] arr, int K, int N, int totalLength) {
        /** array to keep track of non considered positions in subarrays **/
        int[] curPos = new int[K];
        /** final merged array **/
        int[] mergedArray = new int[totalLength];
        int p = 0;
        while (p < totalLength) {
            int min = Integer.MAX_VALUE;
            int minPos = -1;
            /** search for least element **/

            for (int i = 0; i < K; i++) {
                if (curPos[i] < N) {
                    if (arr[i][curPos[i]] < min) {
                        min = arr[i][curPos[i]];
                        minPos = i;
                    }
                }
            }
            curPos[minPos]++;
            mergedArray[p++] = min;
        }
        return mergedArray;
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

// Make the  array list the first one will be for input 
// ArrayList<Integer> input = new ArrayList<>();

// for (int i = 0; i < arr1.length; i++) {
//     for (int j = 0; j < arr1[i].length; j++) {
//         input.add(arr1[i][j]);
//     }
// }
// Collections.sort(input);
// System.out.println(input);
// Initialize the 1D array
// int[] arr2 = new int[totalLength];

// Merge the nested arrays into the 1D array using a merge sort algorithm
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

// Print the resulting 1D array
// System.out.println(Arrays.toString(arr2));
// Find the total length of the 1D array
