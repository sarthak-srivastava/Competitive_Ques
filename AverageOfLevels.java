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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<Double>();
        if(root == null)
            return ans;
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        double av = 0;
        int c = 0;
        while(q.size()!=0)
        {   TreeNode t = q.remove();    
            
            if(t == null && q.peek() == null)
            {
                ans.add(av/c);
                break;
            }
         if(t==null)
         {  q.add(null);
             ans.add(av/c);
             av = 0;
             c = 0;
          continue;
         }
         av +=t.val;
         c++;
         if(t.left!=null)
             q.add(t.left);
         if(t.right!=null)
             q.add(t.right);
        }
        return ans;
    }
}
