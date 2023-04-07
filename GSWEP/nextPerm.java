public class nextPerm {
    /*
    A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
    
    For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
    
    The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
    
    For example, the next permutation of arr = [1,2,3] is [1,3,2].
    Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
    While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
    Given an array of integers nums, find the next permutation of nums.
     */
    public static void main(String[] args) {
        int[] a = {1,2,4,3 };
        nextPerm(a);
        for(int i = 0; i < a.length;i++)
        {
            System.out.println(a[i]);
        }
    }

    public static int[] nextPerm(int[] a)
    {
        int len = a.length;
        if (len < 2) {
            return a;
        }

        int index = len - 1;

        while (index > 0) {
            if (a[index - 1] < a[index]) {
                break;
            }
            index--;
        }
        if (index == 0) {
            reverseSort(a, 0, len - 1);
            return a;
        }
        else
        {
            int v = a[index - 1];
            int j = len - 1;

            while(j>= index)
            {
                if (a[j] > v) {
                    break;
                }
                j--;
            }
            swap(a, j, index - 1);
            reverseSort(a, index, len - 1);
            return a;
        }


    }
    
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void reverseSort(int[] array, int start, int end) {
        if (start < 0 || end >= array.length || start >= end) {
            return;
        }

        for (int i = start; i <= (start + end) / 2; i++) {
            int temp = array[i];
            array[i] = array[start + end - i];
            array[start + end - i] = temp;
        }
    }

}
