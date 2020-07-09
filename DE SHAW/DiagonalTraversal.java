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
    public int[] solve(TreeNode A) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        preorder(A,0, hm);
        int s = 0;
        for(int i = 0; i<hm.size(); i++)
        {
            s += hm.get(i).size();
        }
        int[] ans = new int[s];
        int j = 0;
        for(int i = 0; i<hm.size(); i++)
        {
            ArrayList<Integer> arr = hm.get(i);
            for(int k : arr)
            {
                ans[j++] = k;
            }
        }
        return ans;
    }
    public static void preorder(TreeNode root, int level, HashMap<Integer, ArrayList<Integer>> hm)
    {
        if(root == null)
            return;
        if(!hm.containsKey(level))
        hm.put(level, new ArrayList<Integer>());
        ArrayList<Integer> curr = hm.get(level);
        curr.add(root.val);
        preorder(root.left, level + 1, hm);
        preorder(root.right, level, hm);
    }
}
