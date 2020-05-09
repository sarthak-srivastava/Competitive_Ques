public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] ans = new int[]{-1, -1};
        if(numbers.length <=1)
            return ans;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i< numbers.length; i++)
        {
            if(hm.containsKey(target - numbers[i]))
            {
                ans[0] = hm.get(target - numbers[i]);
                ans[1] = i;
                return ans;
            }
            
            hm.put(numbers[i], i);
        }
        
        return ans;
    }
}
