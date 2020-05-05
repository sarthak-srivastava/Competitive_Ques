// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    char data;
    Node left, right;
    Node(char key)
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
            String str = "";
            str = sc.next();
            GfG gfg = new GfG();
            Node res = gfg.convertExp(str, 0);
            printInorder(res);
            System.out.println();
        }
    }
    
    public static void printInorder(Node node)
    {
        if(node == null)
            return;
       
            System.out.print(node.data + " ");
            printInorder(node.left);
            printInorder(node.right);
        
    }
}
// } Driver Code Ends

/*node of the binary tree
class Node
{
    char data;
    Node left, right;
    Node(char key)
    {
        data = key;
        left = right = null;
    }
}*/
class GfG
{
   
    public static Node convertExp(String str, int i)
    {
        
        if(i > str.length())
         return null;
         
       Node root = new Node(str.charAt(i));
        i++;
        if(i < str.length() && str.charAt(i) == '?')
         root.left = convertExp(str, i+1);
        if(i < str.length() && str.charAt(i) == ':')
         root.right = convertExp(str, i+1);
      
      return root;  
    }
}
