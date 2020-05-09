public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        // write your code here
        if(nums.length <= 1 )
            return nums.length;
        int i = 0;
        int j = 1;
        while(j < nums.length )
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        if(j > i)
            i++;
        
        return i;
    }
}
