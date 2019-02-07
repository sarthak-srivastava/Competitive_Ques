public class Solution {
     TreeNode head=new TreeNode(0);
     TreeNode cur=head;
	public TreeNode flatten(TreeNode a) {
	    //preorder traversal
	    preorder(a);
	    return head.right;
	}
	public void preorder(TreeNode a){
	    if(a==null){
	        return;
	    }
	    cur.right=new TreeNode(a.val);
	    cur=cur.right;
	    preorder(a.left);
	    preorder(a.right);
	}
}
