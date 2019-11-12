/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null)
            return 0;
        HashMap<Integer,Integer> levelSum = new HashMap<Integer,Integer>();
        maxLevelSum(root,1,levelSum);
        int level = Integer.MAX_VALUE;
        int maxSum = -1;
        for(int lvl: levelSum.keySet())
        {
            int sum = levelSum.get(lvl);
            if(sum>maxSum)
            {
                level = lvl;
                maxSum = sum;
            }
            if(sum == maxSum)
                level = Integer.min(level,lvl);
        }
        return level;
    }
    private void maxLevelSum(TreeNode root, int level, HashMap<Integer,Integer> levelSum)
    {
        if(root == null)
            return;
        levelSum.put(level,levelSum.getOrDefault(level,0) + root.val);
        maxLevelSum(root.left,level + 1, levelSum);
        maxLevelSum(root.right,level + 1, levelSum);
        return;
    }
}
