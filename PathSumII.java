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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        pathSum(root,sum,new ArrayList<Integer>(),ans);
        return ans;
    }
    public void pathSum(TreeNode root, int sum, ArrayList<Integer> curr,List<List<Integer>> ans )
    {
        if(root == null)
            return;
        curr.add(root.val);
        if(root.left == null && root.right == null && (sum == root.val))
        {   
          
                ans.add(new ArrayList<>(curr));
        }
      else{
            pathSum(root.left,sum - root.val, curr,ans);
           
            pathSum(root.right,sum - root.val, curr,ans);
      }
        curr.remove(curr.size() - 1);
    }
}
