{
import java.util.*;
class Tree{
int data;
Tree left,right;
Tree(int d)
{
	data=d;
	left=null;
	right=null;
}
}
class IfSubTree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Tree proot=null;
			if(n==1){
				proot=new Tree(sc.nextInt());
				n--;
			}
			while(n-->0){
				int a=sc.nextInt();
				int b=sc.nextInt();
				char lr=sc.next().charAt(0);
				if(proot==null){
					proot=new Tree(a);
					switch(lr){
						case 'L':proot.left=new Tree(b);
						break;
						case 'R':proot.right=new Tree(b);
						break;
					}
				}
				else{
					insert(a,b,lr,proot);
				}
			}
		int m=sc.nextInt();
		Tree rroot=null;
		if(m==1){
			rroot=new Tree(sc.nextInt());
			m--;
		}
		while(m-->0){
			int z=sc.nextInt();
			int y=sc.nextInt();
			char ch=sc.next().charAt(0);
			if(rroot==null){
				rroot=new Tree(z);
				switch(ch){
					case 'L':rroot.left=new Tree(y);
					break;
					case 'R':rroot.right=new Tree(y);
					break;
				}
			}
			else{
				insert(z,y,ch,rroot);
			}
		}
		GfG g=new GfG();
		boolean q=g.isSubtree(rroot,proot);
		if(q==true)
		System.out.println("1");
	else
		System.out.println("0");
		}
	}
	public static void insert(int a,int b,char lr,Tree root){
		if(root==null)
			return;
		if(root.data==a){
			switch(lr){
				case 'L':root.left=new Tree(b);
				break;
				case 'R':root.right=new Tree(b);
				break;
			}
		}
		insert(a,b,lr,root.left);
		insert(a,b,lr,root.right);
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*complete the given function*/
class GfG{
 public static boolean isSubtree(Tree T, Tree S) 
    {
      //add code here.
      if(S == null)
      return true;
      if(T == null)
      return false;
      if(isIdentical(T,S))
      return true;
      return isSubtree(T.left,S)||isSubtree(T.right,S);
    }
    public static boolean isIdentical(Tree t1, Tree t2)
    {
        if(t1 == null && t2 == null)
        return true;
        if(t1 == null || t2 == null)
        return false;
        return (t1.data == t2.data) && (isIdentical(t1.left,t2.left))&& isIdentical(t1.right,t2.right);
    }
}
