/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
            return "null";
        StringBuilder ans = new StringBuilder("");
        solutionBuilder(root,ans);
        // ans.append("]");
        return ans.toString();
    }
    private void solutionBuilder( TreeNode root, StringBuilder ans)
    {
        if(root == null)
        {
            ans.append("null").append(",");
            
        }
        else
        {
            ans.append(Integer.toString(root.val)).append(",");
            solutionBuilder(root.left,ans);
            solutionBuilder(root.right,ans);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue= new LinkedList<>();
        // data = data.substring(1,data.length() - 1);
        String[] vals = data.split(",");
        queue.addAll(Arrays.asList(vals));
        return treeBuilder(queue);
    }
    private TreeNode treeBuilder(Queue<String> queue)
    {
        String curr = queue.remove();
        if(curr.equals("null"))
        {
            return null;
        }
        else
        {
            TreeNode curr_node = new TreeNode(Integer.valueOf(curr));
            curr_node.left = treeBuilder(queue);
            curr_node.right = treeBuilder(queue);
            return curr_node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
