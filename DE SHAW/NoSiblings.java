{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
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
class Nodes_without_sibling
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
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
            g.printSibling(root);
            System.out.println();
            t--;
			
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*  A Binary Tree node
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
	void printSibling(Node node)
	{
		// Your code here
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		printSibling(node,pq);
		if(pq.size() == 0)
		System.out.print(-1);
		else{
		while(pq.size()>0)
	    System.out.print(pq.remove() + " ");
	}
	}
	void printSibling(Node node, PriorityQueue<Integer> pq)
	{
	    if(node == null)
		return;
		if(node.left == null && node.right == null)
		    return;
		if(node.left!=null && node.right!=null)
		{
		    printSibling(node.left,pq);
		    printSibling(node.right,pq);
		}
		else if(node.left == null)
		{
		    pq.add(node.right.data);
		    printSibling(node.right,pq);
		}
		else if(node.right == null)
		{
		    pq.add(node.left.data);
		    printSibling(node.left,pq);
		}
		else
		    return;
	}
}
