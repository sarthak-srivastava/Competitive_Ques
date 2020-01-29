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


public class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null)
        return "";
        StringBuilder serialized = new StringBuilder("");
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size() > 0 )
        {
            TreeNode temp = q.poll();
            if(temp == null)
            {
                serialized.append(" null");
            }
            else{
                serialized.append(" "+temp.val);
                q.offer(temp.left);
                q.offer(temp.right);
            }
        }
        return serialized.toString().trim();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
       if(data == "") return null;
        String[] vals = data.split(" ");
        if(vals.length == 0) return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
        q.add(root);
        TreeNode p = null;
        String val;
        for(int i = 1; i < vals.length; ) {
            p = q.poll();
            val = vals[i++];
            if(val.equals("null")) {
                p.left = null;
            } else {
                p.left = new TreeNode(Integer.valueOf(val));
                q.add(p.left);
            }
            if(i < vals.length) {
                val = vals[i++];
                if(val.equals("null")) {
                    p.right = null;
                } else {
                    p.right = new TreeNode(Integer.valueOf(val));
                    q.add(p.right);
               }
            }
        }
        return root;
}
}
