/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 
 // currSum  - seenSum = sum 

public class Solution {
    /**
     * @param root: 
     * @param sum: 
     * @return: the num of sum path
     */
    static int ans = 0;
    public int pathSum(TreeNode root, int sum) {
        // write your code here
        ans = 0;
        HashSet<Integer> seenSum = new HashSet<>();
        seenSum.add(0);
        pathSumUtil(root, sum, seenSum, 0);
        return ans;
    }
    public void pathSumUtil(TreeNode root, int sum, HashSet<Integer> hs, int currSum)
    {
        if(root == null)
            return;
        currSum += root.val;
        if(hs.contains(currSum - sum))
            ans++;
        hs.add(currSum);
        pathSumUtil(root.left, sum, hs, currSum);
        
        pathSumUtil(root.right, sum, hs, currSum);
        hs.remove(currSum);
    }
}
