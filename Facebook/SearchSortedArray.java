public class Solution {
    /**
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] nums, int target) {
        // write your code here
        int pivot = nums.length;
        int beg = 0;
        int end = nums.length - 1;
        while(beg<=end)
        {
            int mid = (beg+end)/2;
            if(mid>0 && nums[mid]<nums[mid-1])
            {
                pivot = mid;
                break;
            }
            if(nums[mid]>nums[end])
                beg = mid+1;
            else
                end = mid - 1;
        }
        int ans = -1;
        beg = 0;
        end = pivot-1;
        while(beg<=end)
        {
            int mid = (end+beg)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                break;
            }
            if(nums[mid]>target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        if(ans == -1)
        {   beg = pivot;
            end = nums.length - 1;
               while(beg<=end)
        {
            int mid = (end+beg)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                break;
            }
            if(nums[mid]>target)
                end = mid - 1;
            else
                beg = mid + 1;
        }
        }
        System.out.println(pivot);
        return ans;
    }
}
