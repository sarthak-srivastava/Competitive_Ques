public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] ans = {-1, -1};
        if(numbers == null || numbers.length < 2)
        return ans;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
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
