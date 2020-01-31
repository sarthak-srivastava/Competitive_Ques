// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
class Main{
    
    public static void main(String[] args)throws IOException{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
       
        while(t > 0){
            Queue<Node> q = new LinkedList<>();
        
            String X[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(X[0]);
            int k = Integer.parseInt(X[1]);
            // System.out.println(n+" "+k);
            String input[] = br.readLine().trim().split(" ");
            
            Node root = null;
            int j=0;
            while(n > 0){
            int a1 = Integer.parseInt(input[j]);
            int a2 = Integer.parseInt(input[j+1]);
            char lr = input[j+2].charAt(0);
            j+=3;
            
            if(root == null)
            {
                root = new Node(a1);
                q.add(root);
            }
            
            Node pick = q.peek();
            
            q.remove();
            
            if(lr=='L'){
                pick.left = new Node(a2);
                q.add(pick.left);
            }
            a1 = Integer.parseInt(input[j]);
            a2 = Integer.parseInt(input[j+1]);
            lr = input[j+2].charAt(0);
            j += 3;
            
            if(lr=='R'){
                pick.right = new Node(a2);
                q.add(pick.right);
            }
            
            n-=2;
        }
        
        GfG g = new GfG();
        g.printKdistance(root, k);
        System.out.print("\n");
        t--;
            
        }
    }
   
}

// } Driver Code Ends
//User function Template for Java

/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class GfG
{
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
          // Your code here
          if(root == null )
          return;
          if(k == 0){
          System.out.print(root.data+ " ");
          return ;
          }
          printKdistance(root.left, k - 1 );
          printKdistance(root.right, k - 1 );
     }
}
