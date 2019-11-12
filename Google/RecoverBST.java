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
    public void recoverTree(TreeNode root) {
        List<TreeNode> sortednodes = new ArrayList<>();
        inorder(root,sortednodes);
        TreeNode n1 = new TreeNode(0) ;
        int i1 = -1;
        int i2 = -1;
        TreeNode n2 = new TreeNode(0);
        boolean flag = false;
        for(int i = 0; i<sortednodes.size(); i++)
        {
            System.out.print(sortednodes.get(i).val+" ");
            if(i+1<sortednodes.size() && sortednodes.get(i).val>sortednodes.get(i+1).val)
            {   
                if(flag == false)
                {n1 = sortednodes.get(i);
                flag = true;
                 i1 = i;
                }
                else
                {n2 = sortednodes.get(i+1);
                i2 = i;
                }
            }
            // if(n1!=null && n2!=null)
            //     break;
        }
        // System.out.println(n1.val + " "+ n2.val);
        if(i1!= -1 && i2 != -1){
        int temp = n1.val;
        n1.val = n2.val;
        n2.val = temp;
        }
        else
        {
            int temp = sortednodes.get(i1).val;
            sortednodes.get(i1).val = sortednodes.get(i1+1).val;
            sortednodes.get(i1+1).val = temp;
        }
        return;
            
    }
    public void inorder(TreeNode root, List<TreeNode> sortednodes)
    {
        if(root == null)
            return;
        inorder(root.left,sortednodes);
        sortednodes.add(root);
        inorder(root.right,sortednodes);
    }
    // class pair
    // {
    //     int num;
    //     TreeNode node;
    //     public pair(int num,TreeNode node)
    //     {
    //         this.num = num;
    //         this.node = node;
    //     }
    // }
}
