
/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows
class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}*/


class GfG
{
    
    public int longestConsecutive(TreeNode root) {
        int[] res = new int[1]; 
        res[0] = Integer.MIN_VALUE; 
        
        longestConsecutive(root, res, root.key, 0);
        if(res[0] == 1) {
            return -1; 
        } else {
            return res[0];
        }
    }
    
	public void longestConsecutive(TreeNode root, int[] res, int expected, int currLength)
        {
            if(root == null) {
                return; 
            }
            
            if(root.key == expected) {
                currLength ++;
            } else {
                currLength = 1; 
            }
            
            res[0] = Math.max(res[0], currLength);
            
            longestConsecutive(root.left, res, root.key + 1, currLength);
            longestConsecutive(root.right, res, root.key + 1, currLength);
        }
}
