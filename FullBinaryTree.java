{
import java.util.*;
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
  
class BinaryTree 
{
    public static void main(String args[]) 
    {
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node root=null;
			while(n-->0){
				int a1=sc.nextInt();
				int a2=sc.nextInt();
				char lr=sc.next().charAt(0);
				if(root==null){
					root=new Node(a1);
					switch(lr){
						case 'L':root.left=new Node(a2);
						break;
						case 'R':root.right=new Node(a2);
						break;
					}
				}
				else{
					insert(root,a1,a2,lr);
				}
			}
			GfG g=new GfG();
			if(g.isFullTree(root))
				System.out.println("1");
			else
				System.out.println("0"); 
		}
    }
	public static void insert(Node root,int a1,int a2,char lr){
		if(root==null)
			return;
		if(root.data==a1){
			switch(lr){
				case 'L':root.left=new Node(a2);
				break;
				case 'R':root.right=new Node(a2);
				break;
			}
		}
		else{
			insert(root.left,a1,a2,lr);
			insert(root.right,a1,a2,lr);
		}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows:
class Node 
{
    int data;
    Node left, right;
  
    Node(int item) 
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
	boolean isFullTree(Node node)
    {   if(node==null)
        return true;
        //add code here.
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(q.size()!=0)
        {
            Node t = q.remove();
            if((t.left==null && t.right!=null)||(t.right == null && t.left!=null))
            return false;
            if(t.left!=null)
            q.add(t.left);
            if(t.right!=null)
            q.add(t.right);
            
        }
        return true;
    }
}
