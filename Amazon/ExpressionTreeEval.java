{
import java.util.*;
import java.lang.*;
import java.io.*;
class Node{
String data;
Node left,right;
Node(String d){
	data=d;
	left=null;
	right=null;
}
}
class ExpressionTree{
		static Node root;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	
		while(t-->0){
			int n=sc.nextInt();
			String[] s=new String[n];
			for(int i=0;i<n;i++)
				s[i]=sc.next();
			GfG g=new GfG();
		
				root=null;
			makeTree(s,n);
			System.out.println(g.evalTree(root));
		}
	}
	
	
		public static void makeTree(String[] s,int n){
		Queue<Node> queue=new LinkedList<Node>();
		root=new Node(s[0]);
		queue.add(root);
		int p=1;
		try{while(n>0){
		Node proot=queue.poll();
			proot.left=new Node(s[p]);
			queue.add(proot.left);
			p++;
			n--;
			if(n>0){
			proot.right=new Node(s[p]);
			queue.add(proot.right);
			p++;
			n--;}
		}}catch(ArrayIndexOutOfBoundsException ex){}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Tree node is defined as
class Node
{
    String data;
    Node left,right;
    Node(String data)
     {
	 this.data = data;
	 this.left = null;
	 this.right = null;
     }
}*/
class GfG{
      public int evalTree(Node root)
      {
          //Your code here.
          if(root == null)
          return 0;
          if(root.left== null && root.right== null)
          {
                return Integer.parseInt(root.data);
          }
          else
          {
              char c = root.data.charAt(0);
                int ans = 0;
                switch(c){
                case '*':
                    return (evalTree(root.left)*evalTree(root.right));
                case '/':
                    return (evalTree(root.left)/evalTree(root.right));
                case '+':
                    return (evalTree(root.left)+evalTree(root.right));
                case '-':
                    return (evalTree(root.left)-evalTree(root.right));
                }
              return ans;
          }
      }
}
