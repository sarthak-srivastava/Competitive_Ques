// { Driver Code Starts
// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;

// A Binary Search Tree node
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


class BST_Lowest_Common_Ancestor
{
	Node root;
	
	void insert(Node root, int key)
	{
		if(key < root.data)
		{   
			if(root.left != null)
				insert(root.left, key);
			else
			{
	            root.left = new Node(key);
			}
		}
		else if(key > root.data)
		{
			if(root.right != null)
				insert(root.right, key);
			else
			{
			    root.right = new Node(key);
			}
		}
	}
	
    public static void main(String args[])
    {
		
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		
        while (t > 0)
        {

            int n = sc.nextInt();
		    BST_Lowest_Common_Ancestor tree = new BST_Lowest_Common_Ancestor();

			int a1 = sc.nextInt();
			Node root = new Node(a1);
			
			for(int i=1;i<n;i++)
            {
				int a = sc.nextInt();
				tree.insert(root,a);
			}
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
		
            BST g = new BST();

			Node s = g.LCA(root, n1, n2);
			System.out.println(s.data);
            
		t--;
		}
    }
}

// } Driver Code Ends
/* A Binary Search Tree node */
/* class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class BST
{   
    Node LCA(Node node, int n1, int n2) 
    {
        // Your code here
        if( node == null )
        return null;
        if(node.data > n1 && node.data > n2)
        {
            return LCA(node.left,n1,n2);
        }
       if(node.data < n1 && node.data < n2)
        {
            return LCA(node.right,n1,n2);
        }
        return node;
        
    }
    
}

