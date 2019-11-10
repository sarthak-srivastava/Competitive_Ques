/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    TreeNode curr;
    int i = 0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public BSTIterator(TreeNode root) {
        curr = root;
        inorderTraversal(curr,arr);
    }
    private void inorderTraversal(TreeNode curr, ArrayList<Integer> arr)
    {
        if(curr == null)
            return;
        inorderTraversal(curr.left,arr);
        arr.add(curr.val);
        inorderTraversal(curr.right,arr);
    }
    
    /** @return the next smallest number */
    public int next() {
        return arr.get(i++);
    
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return i<(arr.size());
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
