{
import java.util.Scanner;
import java.lang.Integer;
import java.util.HashMap;
//import java.lang.Math;
import java.io.*;
import java.util.*;
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
class Tree_Left_View
{
    public static void main(String args[])
    {
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
			g.leftView(root);
			System.out.println();
         t--;	
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
      static int  max_level = 0; 
  
    // recursive function to print left view 
    void leftViewUtil(Node node, int level) 
    { 
        // Base Case 
        if (node==null) return; 
  
        // If this is the first node of its level 
        if (max_level < level) 
        { 
            System.out.print(node.data+" "); 
            max_level = level; 
        } 
  
        // Recur for left and right subtrees 
        leftViewUtil(node.left, level+1); 
        leftViewUtil(node.right, level+1); 
    } 
  
    // A wrapper over leftViewUtil() 
    void leftView(Node root) 
    {   max_level = 0;
        leftViewUtil(root, 1); 
    } 
}
