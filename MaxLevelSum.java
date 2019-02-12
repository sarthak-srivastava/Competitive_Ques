{
import java.util.*;
import java.lang.Math;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class Tree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node root=null;
			for(int i=0;i<n;i++){
				int a=sc.nextInt();
				int b=sc.nextInt();
				char c=sc.next().charAt(0);
				if(root==null){
					root=new Node(a);
					switch(c){
						case 'L':root.left=new Node(b);
							break;
						case 'R': root.right=new Node(b);
						break;
					}
				}
				else
					insert(root,a,b,c);
			}
			GfG g=new GfG();
			System.out.println(g.maxLevelSum(root));
		}
	}
	public static void insert(Node root,int a,int b,char c){
		if(root==null)
			return;
		if(root.data==a){
			switch(c){
				case 'L':root.left=new Node(b);
					break;
				case 'R': root.right=new Node(b);
				break;
			}
		}
		else
		{
			insert(root.left,a,b,c);
			insert(root.right,a,b,c);
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the finction below
Node is as follows
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
	public static int maxLevelSum(Node root)
         {
         //add code here.
         if(root == null)
         return 0;
         int max_sum = Integer.MIN_VALUE;
         Queue<Node> q= new LinkedList<>();
         q.add(root);
         q.add(null);
         max_sum = root.data;
         int tsum = 0;
         while(q.size()!=0)
         {
             Node temp = q.remove();
             if(temp == null && q.peek() == null)
             {  if(tsum>max_sum)
                    max_sum = tsum;
                 return max_sum;}
             if(temp==null)
             {
                 q.add(null);
                 if(tsum>max_sum)
                 max_sum = tsum;
                 tsum = 0;
                 continue;
             }
             
             tsum += temp.data;
             if(temp.left!=null)
             q.add(temp.left);
             if(temp.right!=null)
             q.add(temp.right);
         }
          return max_sum;
             
         }
}
