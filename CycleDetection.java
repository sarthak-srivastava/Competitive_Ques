{
//Code by Saksham Raj Seth
import java.io.*;
import java.util.*;
import java.lang.*;
class Graph{
	@SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0){
			int v = in.nextInt();
			int e = in.nextInt();
			LinkedList<Integer>[] alist = new LinkedList[v];
			for(int i=0;i<v;i++) alist[i] = new LinkedList<Integer>();
			while(e-->0) {
				int n1 = in.nextInt();
				int n2 = in.nextInt();
				alist[n1].add(n2);
			}
			boolean[] visited = new boolean[v];
			boolean[] explored = new boolean[v];
			GfG g = new GfG();
			if(g.hasCycle(v,alist,visited,explored)) {
				System.out.println(1);
			}
			else
				System.out.println(0);
		}
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    public boolean hasCycle(int v,LinkedList<Integer>[] alist,boolean[] visited,boolean[] explored) 
     {
       // add code here.
       if(explored[v] == true)
       return true;
       if(visited[v] == true)
       return false;
       explored[v] = true;
       visited[v] = true;
       List<Integer> children = alist[v];
       for(Integer c: children)
       {
           if(hasCycle(c,alist,visited,explored))
           return true;
           
       }
       explored[v] = false;
       return false;
     }
}
