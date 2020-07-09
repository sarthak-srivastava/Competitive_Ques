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
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        int level = 0;
        int s = 0; // for size of tree
        while(q.size() > 0)
        {
            TreeNode curr = q.poll();
            if(curr == null)
            {   
                level++;
                q.offer(null);
                if(q.peek() == null)
                break;
            }
            else
            {   s++;
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                if(!hm.containsKey(level))
                hm.put(level, new ArrayList<Integer>());
                ArrayList<Integer> tmp = hm.get(level);
                tmp.add(curr.val);
            }
        }
        int[] ans = new int[s];
        int i = 0;
        for(int l = hm.size() - 1; l >= 0; l--)
        {
            ArrayList<Integer> tmp = hm.get(l);
            for(int j : tmp)
            {
                ans[i++] = j;
            }
        }
        return ans;
        
    }
}
