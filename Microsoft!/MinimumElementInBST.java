// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}

class BinarySearchTree
{
   
    
   static Node insert(Node node, int data)
    {
     if (node == null)
     {
            return (new Node(data));
    } else 
        {
             
            /* 2. Otherwise, recur down the tree */
            if (data <= node.data)
            {
                node.left = insert(node.left, data);
            } else 
            {
                node.right = insert(node.right, data);
            }
 
            /* return the (unchanged) node pointer */
            return node;
        }
    
    }
    
    //int minValue(Node node);
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            
            while(n-- > 0)
            {
                int data = sc.nextInt();
                root = insert(root, data);
            }
            
             BST gfg = new BST();
             
             System.out.println(gfg.minValue(root));
        }
    }
}// } Driver Code Ends
/* A binary search tree node class

class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
*/
// your task is to complete the below function
class BST
{
    int minValue(Node node)
    {
    if(node == null)
        return -1;
    int min = node.data;
    while(node!=null)
    {   min = node.data;
        node = node.left;
        
    }
    return min;
    }
}

