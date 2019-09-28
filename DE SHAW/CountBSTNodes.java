{
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    Node root=null;
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		   
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        root=Geeks.newNode(root,arr[i]);
		    }
		    int l,h;
		    l=sc.nextInt();
		    h=sc.nextInt();
		    System.out.println(Geeks.getCountOfNode(root,l,h));
		
		}
	}
}
class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node(value);
        
        return temp;
    }
    static public Node newNode(Node root,int data)
    {
        if(root==null)
        root=createNewNode(data);
        else if(data<root.data)
        root.left=newNode(root.left,data);
        else
        root.right=newNode(root.right,data);
        
        return root;
    }
  
    //Position this line where user code will be pasted.
    
}

}
/*This is a function problem.You only need to complete the function given below*/
// A Binary Search Tree node
/*
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
*/
//Complete this function
public static int getCountOfNode(Node root,int l, int h)
{
    //Your code here
    if(root == null || l>h)
    return 0;
    return helper(root,l,h);
}
public static int helper(Node root, int l, int h)
{   int count = 0;
    if(root == null)
    return 0;
    if(root.data<=h && root.data>=l)
    count++;
    return count + helper(root.left,l,h) + helper(root.right,l,h);
}
