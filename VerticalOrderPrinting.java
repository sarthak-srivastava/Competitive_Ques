{
//Initial Template for Java
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class BinaryTree
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node>();
            int n = sc.nextInt();
            Node root = null;
            while(n-- > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
	        	char lr= sc.next().charAt(0);
				
                
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
            }
            
            GFG gfg = new GFG();
            gfg.verticalOrder(root);
            System.out.println();
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/* A binary tree node has data, pointer to left child
   and a pointer to right child 
class Node
{
    int data;
    Node left;
    Node right;
} */
class GFG
{
    static void verticalOrder(Node root)
    {
        // add your code
        TreeMap<Integer,ArrayList<Integer>> hm = new TreeMap<Integer,ArrayList<Integer>>();
        verticalOrderUtil(root,hm,0);
        Iterator it = hm.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            ArrayList<Integer> al = (ArrayList)pair.getValue();
            for(int i = 0;i<al.size();i++)
            System.out.print(al.get(i)+" ");
        }
        
    }
    public static void verticalOrderUtil(Node root, TreeMap<Integer,ArrayList<Integer>> hm,int hd)
    {   if(root == null)
            return;
        if(!hm.containsKey(hd))
        {   ArrayList<Integer> al = new ArrayList<Integer>();
            al.add(root.data);
            hm.put(hd,al);
        }
        else
        {
            ArrayList<Integer> al = hm.get(hd);
            al.add(root.data);
            hm.remove(hd);
            hm.put(hd,al);
            
        }
        verticalOrderUtil(root.left,hm,hd-1);
        verticalOrderUtil(root.right,hm,hd+1);
    }
}
