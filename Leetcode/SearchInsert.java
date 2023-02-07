public class SearchInsert {
    /*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    
    You must write an algorithm with O(log n) runtime complexity.
    
    
    
    Example 1:
    
    Input: nums = [1,3,5,6], target = 5
    Output: 2
    
    Example 2:
    
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    
    Example 3:
    
    Input: nums = [1,3,5,6], target = 7
    Output: 4
    
    
    
    Constraints:
    
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104  */
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle = start + (end - start) / 2;
        if (nums[start] == target) {
            return start;
        } else if (nums[end] == target) {
            return end;
        }
        while (end - start > 0) {
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
                middle = start + (end - start) / 2;
            } else {
                end = middle - 1;
                middle = start + (end - start) / 2;
            }
        }
        if (nums[middle] < target) {
            return middle + 1;
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        //          0  1  2  3  4
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 9, 11 };
        int[] c = { 1, 3, 5, 6 };
        System.out.println(searchInsert(c, 5));
    }

}

// middle = 0 + 3 - 0 -> 3/2 -> 1

//     int start = 0;
//     int end = nums.length - 1;
// int middle = start + (end - start) / 2;if(nums[start]>target)
//     {
//         return 0;
//     }if(nums[end]<target)
//     {
//         return end + 1;
//     }while(end-start>1)
// {
//             if (nums[middle] == target) {
//                 return middle-1x;
//             } else if (nums[middle] > target) {
//                 end = middle - 1;
//                 middle = start + (end - start) / 2;

//             } else {
//                 start = middle + 1;
//                 middle = start + (end - start) / 2;
//             }
//         }if(nums[middle]>target)
//     {
//         return middle;
//     }else
// {
//             return middle + 1;
//         }
