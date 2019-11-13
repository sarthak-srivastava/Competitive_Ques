class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return "";
        String[] numStr = new String[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            numStr[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(numStr,(a,b) -> (b+a).compareTo(a+b));
        String ans = "";
        for(String str:numStr)
            ans = ans + str;
        while(ans.length()>1 && ans.charAt(0) == '0')
            ans = ans.substring(1);
        return ans;
        
    }
}
