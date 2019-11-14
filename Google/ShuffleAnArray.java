import java.util.*;
class Solution {
    int[] arr;
    int[] org;
    public Solution(int[] nums) {
        arr = nums;
        org = new int[arr.length];
        for(int i = 0; i<arr.length;i++)
            org[i] = nums[i];
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return org;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i: arr)
            temp.add(i);
        Collections.shuffle(temp);
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = temp.get(i);
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
