class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>();
        // handle corner case
        if (candidates.length == 0) {
            result.add(list);
            return result;
        }
        
        Arrays.sort(candidates);
        recursiveHelper(candidates, target, target, list, result, 0);
        
        return result;
    }
    
    private void recursiveHelper(int[] candidates, int target, int update, List<Integer> list, List<List<Integer>> result, int position) {
        if (update == 0) {
            result.add(new ArrayList<Integer>(list));
        } else {
            for (int i = position; i < candidates.length; i++) {
                if (update - candidates[i] >= 0) {
                    list.add(candidates[i]);
                    recursiveHelper(candidates, target, update - candidates[i], list, result, i);
                    list.remove(list.size() - 1);
                } else {
                    break;
                }
            }
        }
    }
}
