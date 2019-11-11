// declare a HashSet storing all the encountered positive integers
// intialize a varaibale missingPositive with 1 and increment it till we can't find it in HashSet anymore.
// return this value of missingPositive

class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 1;
        HashSet<Integer> encounteredNumbers = new HashSet<>();
        for(int i: nums)
        {
            if (i>0)
            encounteredNumbers.add(i);
        }
        int missingPositive = 1;
        while(encounteredNumbers.contains(missingPositive))
            missingPositive++;
        return missingPositive;
    }
}
