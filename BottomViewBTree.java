{
// Java Program to print Bottom View of Binary Tree
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;
import java.io.*;
import java.util.*;
 
// Tree node class
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
 
	
class BottomView
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
            
			//g.leftView(root);
			g.bottomView(root);
			
			System.out.println();
         t--;			
        }
    }
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Tree node class
class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class GfG
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        // Your code here
        root.hd = 0;
        TreeMap<Integer,Node> hm = new TreeMap<Integer,Node>();
        bottomViewUtil(root,hm,0);
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            Node t = (Node)pair.getValue();
        System.out.print( t.data+" ");
        it.remove();
        }
    }
    public void bottomViewUtil(Node root, TreeMap<Integer,Node> hm,int hd)
    {   if(root == null)
            return;
        if(!hm.containsKey(hd))
        hm.put(hd,root);
        else
        {
            hm.remove(hd);
            hm.put(hd,root);
        }
        bottomViewUtil(root.left,hm,hd-1);
        bottomViewUtil(root.right,hm,hd+1);
    }
}
	
