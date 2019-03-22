{
// Java program to find out whether a given graph is Bipartite or not
import java.util.*;
import java.lang.*;
import java.io.*;
class Bipartite
{ 
	public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
        int V = sc.nextInt();
		int[][] G = new int[V][V];
		for(int i = 0; i < V; i++)
			for(int j = 0; j < V; j++)
				G[i][j] = sc.nextInt();
		GfG b = new GfG();
        if (b.isBipartite(G, V))
           System.out.println("1");
        else
           System.out.println("0");
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
	  boolean isBipartite(int G[][],int V)
       {
          //add code here.
          int[] color = new int[V];
          for(int i = 0;i<V;i++)
          color[i] = -1;
          
          for(int i = 0; i<V;i++)
          {
              if(color[i] == -1)
              if(isBipartiteUtil(G,i,color) == false)
              return false;
              
              
          }
          return true;
        }
        boolean isBipartiteUtil(int[][] G, int V, int[] color)
        {
            if(G[V][V] == 1)
            return false;
            color[V] = 1;
            Queue<Integer> q = new LinkedList<>();
            q.add(V);
            while(q.size()!=0)
            {
                int t = q.poll();
                if(G[t][t] == 1)
                return false;
                for(int i = 0; i<G.length;i++)
                {
                    if(G[V][i] == 1 && color[i]==-1)
                    {
                        color[i] = 1 - color[V];
                        q.add(i);
                    }
                    else if(G[V][i] == 1 && color[i] == color[V])
                    return false;
                }
                
                }
                return true;
            
        }
}
