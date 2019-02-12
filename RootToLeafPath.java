{
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
class PrintPaths{
    public static void main(String[] args)throws IOException{
        //Scanner sc=new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            Node root=null;
            int j =0;
            String input[] = br.readLine().split(" +");
            while(n-->0){
                int a1=Integer.parseInt(input[j]);
                int a2=Integer.parseInt(input[j+1]);
                char lr=input[j+2].charAt(0);
                if(root==null){
                    root=new Node(a1);
                    switch(lr){
                        case 'L':root.left=new Node(a2);
                            break;
                        case 'R':root.right=new Node(a2);
                            break;
                    }
                }
                else{
                    insert(root,a1,a2,lr);
                }
                j+=3;
            }
            GfG g=new GfG();
            g.printPaths(root);
            System.out.println();
        }
    }
    public static void insert(Node root,int a1,int a2,char lr){
        if(root==null)
            return;
        if(root.data==a1){
            switch(lr){
                case 'L':root.left=new Node(a2);
                    break;
                case 'R':root.right=new Node(a2);
                    break;
            }
        }
        insert(root.left,a1,a2,lr);
        insert(root.right,a1,a2,lr);
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	public void printPaths(Node root)
       {
          //add code here.
          if(root == null)
          return;
         printPathsUtil(root,"");
          
       }
       public static void printPathsUtil(Node root, String str)
       {
           if(root == null)
          return;
          if(root.left == null && root.right == null)
          {
              System.out.print(str+root.data+" #");
                return;    
          }
          str = str +Integer.toString(root.data)+" ";
          printPathsUtil(root.left,str);
          printPathsUtil(root.right,str);
       }
}
