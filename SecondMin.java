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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return -1;
        if(root.left==null && root.right == null)
            return -1;
        q.add(root);
        while(q.size()!=0)
        {
            TreeNode t = q.remove();
            arr.add(t.val);
            if(t.left!=null)
                q.add(t.left);
            if(t.right!=null)
                q.add(t.right);
        }
        Collections.sort(arr);
        int i = -1;
        int f = arr.get(0);
        if(arr.size()<2)
            return -1;
        for(int j = 1;j<arr.size();j++)
        {
            if(arr.get(j)!=f)
                return arr.get(j);
        }
        return i;
    }
}
