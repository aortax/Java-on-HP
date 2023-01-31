public class removeDuplicates
{
    public static void main(String[] args)
    {

    }
    public int removeDuplicates(int[] nums) {
        int removedElements = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                removedElements++;
            }
            nums[i-removedElements] = nums[i];
        }
        return nums.length - removedElements;
    }


}


/*
 * Cover chapter 2- 7 and then  chapter 11 & 13 
 */