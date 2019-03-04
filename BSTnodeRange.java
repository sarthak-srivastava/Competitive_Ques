{

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
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
class Node
{
    int data;
    Node left;
    Node right;
}
class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node();
        temp.data=value;
        temp.left=null;
        temp.right=null;
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

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// A Binary Search Tree node
/*
Structure of node
class Node
{
    int data;
    Node left;
    Node right;
}
*/
//Complete this function
static int count;
public static int getCountOfNode(Node root,int l, int h)
{
    //Your code here
    count = 0;
    return getCountUtil(root,l,h);
}
public static int getCountUtil(Node root, int l, int h)
{   if(root == null)
    return 0;
if(root.data > h)
return getCountUtil(root.left,l,h);
if(root.data< l)
return getCountUtil(root.right,l,h);
else{
count++;
getCountUtil(root.right,l,h);
getCountUtil(root.left,l,h);

}
return count;
}
