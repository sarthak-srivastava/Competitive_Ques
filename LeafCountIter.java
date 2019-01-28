{
//Initial Template for Java
// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;
// A Binary Tree node
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
class CountLeafNodes
{
	void inorder(Node node)
	{
		if(node==null)
			return ;
		else
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
			
					
	}
	
    // driver function to test the above functions
    public static void main(String args[]) throws IOException
    {
		CountLeafNodes CLN = new CountLeafNodes();
		//Index index_obj = new Index();
        // Input the number of test cases you want to run
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            
            int n = Integer.parseInt(br.readLine());
            Node root = null;
            
            String nums[] = br.readLine().split(" ");            
            int mm = n;
            for( int idx = 0; idx < mm; idx++)
            {	
			
                int n1 = Integer.parseInt(nums[idx*3]);
                int n2 = Integer.parseInt(nums[idx*3+1]);
                String lr = nums[idx*3+2];
                
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr.equals("L"))
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
            }
			
            GfG g = new GfG();
			int res = g.countLeaves(root);
			System.out.println(res);
			//CLN.inorder(root);
			 t--;
			// System.out.println();
        }
        br.close();
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class GfG
{
    int countLeaves(Node node) 
    {
         // Your code  
         if(node == null)
         return 0;
         int count = 0 ;
         Queue<Node> stk = new LinkedList<>();
         stk.add(node);
         while(stk.size()!=0)
         {
             Node t = stk.remove();
             if(t.left == null && t.right == null)
             {count++;
             continue;}
             if(t.left!=null)
             stk.add(t.left);
             if(t.right!= null)
             stk.add(t.right);
             
         }
         return count;
    }
}
