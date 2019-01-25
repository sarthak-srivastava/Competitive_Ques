import java.util.*;
class InOrderTraversalStack{
    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // System.out.println(root.left.data);
        System.out.println(InOrderTraversal(root));
    }
    public static List<Integer> InOrderTraversal(TreeNode root)
    {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stk = new Stack<TreeNode>();
        // stk.push(root);
        while(root!=null || !stk.isEmpty())
        {
            if(root!=null)
            {
                stk.push(root);
                root = root.left;
                continue;
            }
            root = stk.pop();
            list.add(root.data);
            // System.out.println(list.size());
            root = root.right;
        }
        return list;
    }
}