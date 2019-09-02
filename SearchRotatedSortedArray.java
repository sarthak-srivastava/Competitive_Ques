class Solution {
    public int search(int[] nums, int target) {
        // The array can be divided into 2 portions such that sub arrays are correctly sorted.
        // We can attempt to search for the element in each of subarray individually.
        // Index of division can be found using binary search as well.
        // nums[i]<nums[i-1] where i is the point of division of new array
        
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
