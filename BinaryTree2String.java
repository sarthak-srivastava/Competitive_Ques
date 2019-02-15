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
    class ds{
        String ans;
        ds()
        {ans = "";
        }
    }
    static String ans = "";
    public String tree2str(TreeNode t) {
        ds a = new ds();
        tree2str(t,a);
        return a.ans;
            }
    public static void tree2str(TreeNode t, ds a)
    {
        if(t == null)
            return ;
        a.ans += Integer.toString(t.val);
        if(t.left == null && t.right!=null)
            a.ans +="()";
        if(t.left!=null){
        a.ans +="(";
            tree2str(t.left,a);
        a.ans +=")";
        }
        // if(t.left != null && t.right==null)
        //     ans +="()";
        if(t.right!=null)
        {
            a.ans +='(';
            tree2str(t.right,a);
            a.ans+=')';
        }
        
        return ;

    }
}
