/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		root = new Node(10); 
        root.left = new Node(11); 
        root.left.left = new Node(7); 
        root.right = new Node(9); 
        root.right.left = new Node(15); 
        root.right.right = new Node(8); 
       
        System.out.print( "Inorder traversal before insertion:"); 
        inorder(root); 
       
        int key = 12; 
        insert(root, key); 
       
        System.out.print("\nInorder traversal after insertion:"); 
        inorder(root); 
	}
	static class Node{
	    int val;
	    Node left;
	    Node right;
	    public Node(int key)
	    {
	        this.val = key;
	        left = null;
	        right = null;
	    }
	}
	 static Node root; 
    static Node temp = root; 
      
    /* Inorder traversal of a binary tree*/
    static void inorder(Node temp) 
    { 
        if (temp == null) 
            return; 
       
        inorder(temp.left); 
        System.out.print(temp.val+" "); 
        inorder(temp.right); 
    } 
       
    /*function to insert element in binary tree */
    static void insert(Node temp, int key) 
    { Queue<Node> q= new LinkedList<>();
    if(temp == null)
    {
        temp = new Node(key);
        return;
    }
    q.add(temp);
    while(q.size()!=0)
    {
        Node t = q.remove();
        if(t.left==null)
        {
            t.left = new Node(key);
            break;
        }
        else
        q.add(t.left);
        if(t.right == null)
        {
            t.right = new Node(key);
            break;
        }
        else
        q.add(t.right);
    }
        
    }
    
}
