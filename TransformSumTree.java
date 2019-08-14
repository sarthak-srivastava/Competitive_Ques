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
class SumTree{
	
	public static void inOrder(Tree node){
		if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Tree root=null;
			if(n==1){
				System.out.println(sc.nextInt());
				n--;
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
						insert(n1,n2,lr,root);
					}
				}
			}
		GfG g=new GfG();
		g.toSumTree(root);
		inOrder(root);
		System.out.println();
		}
	}
	public static void insert(int n1,int n2,char lr,Tree root){
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
	insert(n1,n2,lr,root.left);
	insert(n1,n2,lr,root.right);
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the Given Function
Node is as follows:
class Tree{
int data;
Tree left,right;
Tree(int d){
	data=d;
	left=null;
	right=null;
}
}*/
class GfG{
    public void toSumTree(Tree root){
         //add code here.
         if(root == null)
         return;
         toSumTree(root,0);
    }
    public int toSumTree(Tree root, int sum)
    {   
        if(root.left == null && root.right == null)
        {
            sum = root.data;
            root.data = 0;
            return sum;
        }
        int a = root.data;
        root.data = toSumTree(root.left,sum) + toSumTree(root.right,sum);
        return a + root.data;
    }
}
