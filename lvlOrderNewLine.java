{
// INITIAL CODE
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
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
class Level_Order_Traverse
{
	
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
		
            GfG g = new GfG();
            g.levelOrder(root);
			System.out.println();
            t--;
			
        }
    }
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    void levelOrder(Node node) 
    {
        // Your code here
            Queue<Node> q= new LinkedList<>();
        q.add(node);
        q.add(null);
        while(q.size()!=0)
        {
            Node t = q.peek();
            q.remove();
            if(t == null && q.peek()==null)
            break;
            if(t == null)
            {q.add(null);
            System.out.print("$ ");
            }
            else
            {
                System.out.print(t.data+" ");
                if(t.left!=null)
                q.add(t.left);
                if(t.right!=null)
                q.add(t.right);
                
            }
            
        }
        System.out.print("$");
    }
}
