{
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
        left = right = null;}}
class BST_Add_Nodes
{
    Node root;
    void inorder(Node node)
    {
        if(node==null)
            return ;
        else
            inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //Node root;
        while (t > 0)
        {
            //Node root;
            //Node tmp;
            //root = null;
            int n = sc.nextInt();
            BST_Add_Nodes tree = new BST_Add_Nodes();
            GfG g = new GfG();
            Node root = null;
            for(int i=0; i<n; i++)
            {
                int a = sc.nextInt();
                root = g.insert(root, a);
            }
            //GfG g = new GfG();
            tree.inorder(root);
            System.out.println();
            t--;
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of BST node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null; }
}*/
class GfG
{
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {    insertUtil(root,data);
    return root;
    }
    public Node insertUtil(Node root, int data)
    {
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = insertUtil(root.left, data); 
        else if (data > root.data) 
            root.right = insertUtil(root.right, data); 
  
        return root; 
    }
}
