public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> ans = new ArrayList<>();
        if(numbers.length <= 2)
            return ans;
        Arrays.sort(numbers);
        int i = 0, j = 0, k = 0;
        for(i = 0; i < numbers.length - 2; i++)
        {
            if(i > 0 && numbers[i] == numbers[i-1])
                continue;
            j = i + 1;
            k = numbers.length - 1;
            while(j < k)
            {
                if(k < numbers.length - 1 && numbers[k] == numbers[k+1])
                {
                    k--;
                    continue;
                }
                int sum = numbers[i] + numbers[j] + numbers[k];
                if(sum < 0)
                {
                    j++;
                }
                else if(sum > 0)
                {
                    k--;
                }
                else
                {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(numbers[i]);
                    curr.add(numbers[j]);
                    curr.add(numbers[k]);
                    ans.add(curr);
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
