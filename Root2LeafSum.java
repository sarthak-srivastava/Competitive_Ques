{
import java.util.*;
class Tree{
int data;
Tree left,right;
Tree(int d){
data=d;
left=null;
right=null;
}
}
class RootToLeafNodes{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Tree root=null;
			if(n==0){
				System.out.println("0");
				continue;
			}
			if(n==1){
				System.out.println(sc.nextInt());
				continue;
			}
			else{
				while(n-->0){
					int n1=sc.nextInt();
					int n2=sc.nextInt();
					char lr=sc.next().charAt(0);
					if(root==null){
						root=new Tree(n1);
						switch(lr){
							case 'L':root.left=new Tree(n2);
							break;
							case 'R':root.right=new Tree(n2);
							break;
						}
					}
					else{
						insert(root,n1,n2,lr);
					}
				}
			}
//			inorder(root);
		GfG g=new GfG();
		System.out.println(g.treePathsSum(root));
		}
	}
public static void insert(Tree root,int n1,int n2,char lr){
		if(root==null)
			return;
		if(root.data==n1){
			switch(lr){
				case 'L':root.left=new Tree(n2);
				break;
				case 'R':root.right=new Tree(n2);
				break;
			}
		}
	else{
		insert(root.left,n1,n2,lr);
		insert(root.right,n1,n2,lr);
		}
	}
/*public static void inorder(Tree root)
{
	if(root==null)
		return;
	inorder(root.left);
	System.out.println(root.data);
	inorder(root.right);
}*/
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below.
Node is as follows:
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}*/
class GfG
{   static int sum;
	public static int treePathsSum(Tree root)
        {
            
         //add code here.
         sum = 0;
         treePathsSumUtil(root,0);
         return sum/2;
	}
	public static void treePathsSumUtil(Tree root, int ssf)
	{
	    if(root == null)
	    {
	        sum += ssf;
	        return;
	    
	    }
	    treePathsSumUtil(root.left,ssf*10+root.data);
	    treePathsSumUtil(root.right,ssf*10+root.data);
	}
}
