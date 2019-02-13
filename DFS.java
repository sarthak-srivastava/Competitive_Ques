{
//Code by Saksham Raj seth
import java.io.*;
import java.util.*;
 class DFS{
	 private static int V;
     private static LinkedList<Integer> adj[];
      @SuppressWarnings("unchecked")
    DFS(int v)
    {
        V = v;
        adj = new LinkedList[10001];
        for (int i=0; i<10001; ++i)
            adj[i] = new LinkedList<Integer>();
    }
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			boolean[] vis = new boolean[10001];
			for(int i=0;i<10001;i++)
				vis[i]=false;
			int n = sc.nextInt();
			DFS d = new DFS(n);
			for(int i = 0; i < n ; i++)
				addEdge(sc.nextInt(),sc.nextInt());
			GfG g = new GfG();
			g.DFS(1,adj,vis);
			System.out.println();
		}
    }
	 public static void addEdge(int v, int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{   
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
      // add code here.
      visited[v] = true;
      System.out.print(v+" ");
      Iterator<Integer> it = adj[v].listIterator();
      while(it.hasNext())
      {
          int i = it.next();
          if(!visited[i])
          DFS(i,adj,visited);
      }
    }
}
