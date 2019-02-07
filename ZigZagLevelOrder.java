/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> stk1 = new Stack<TreeNode>();
        Stack<TreeNode> stk2 = new Stack<TreeNode>();
        if(A == null)
        return ans;
        stk1.push(A);
        while(stk1.size()!=0 || stk2.size()!=0)
        {        ArrayList<Integer> t = new ArrayList<Integer>();

            while(stk1.size()!=0)
            {
                TreeNode tmp = stk1.pop();
                t.add(tmp.val);
                if(tmp.left!=null)
                {
                    stk2.push(tmp.left);
                }
                if(tmp.right!=null)
                {
                    stk2.push(tmp.right);
                }
            }
            // System.out.println(t);
            if(t.size()!=0)
            ans.add(new ArrayList<Integer>(t));
            ArrayList<Integer> t1 = new ArrayList<Integer>();
                while(stk2.size()!=0)
            {
                TreeNode tmp = stk2.pop();
                t1.add(tmp.val);
                
                if(tmp.right!=null)
                {
                    stk1.push(tmp.right);
                }
                if(tmp.left!=null)
                {
                    stk1.push(tmp.left);
                }
            }
            // System.out.println(t1);
            if(t1.size()!=0)
            ans.add(new ArrayList<Integer>(t1));
        }
        return ans;
    }
}
