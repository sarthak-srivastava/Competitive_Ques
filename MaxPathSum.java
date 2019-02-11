{
import java.util.*;
import java.lang.*;
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
class PathSum
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i = 0; i < n; i++)
            {
                int a = sc.nextInt();
                int a1 = sc.nextInt();
                char lr = sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                   
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                                
                        break;
                        case 'R':root.right=new Node(a1);
                                 
                        break;
                    }
                }
                else
                {
                    insert(root, a, a1, lr);
                }
            }
            GfG gfg = new GfG();
            System.out.println(gfg.maxPathSum(root));
        }
    }
    
    public static void insert(Node root, int a, int a1, char lr)
    {
         if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    
    
    
     public static int maxPathSumUtil(Node node, Res res) { 
  
        // Base cases 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return node.data; 
  
         
        int ls = maxPathSumUtil(node.left, res); 
        int rs = maxPathSumUtil(node.right, res); 
  
        // If both left and right children exist 
        if (node.left != null && node.right != null) { 
  
         
            res.val = Math.max(res.val, ls + rs + node.data); 
  
         
            return Math.max(ls, rs) + node.data; 
        } 
  
 
        return (node.left == null) ? rs + node.data 
                : ls + node.data; 
    } 
  

    static class Res{
        int val;
    }
    public static int maxPathSum(Node node) 
    { 
        Res res = new Res(); 
        res.val = Integer.MIN_VALUE; 
        maxPathSumUtil(node, res); 
        return res.val; 
    }
}
