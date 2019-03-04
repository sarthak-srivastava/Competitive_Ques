{
import java.io.*;
import java.util.*;
class GFG2{
    @SuppressWarnings("unchecked")
public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        ArrayList<Integer>[] adj=new ArrayList[10001];
        while(t-->0)
        {
        int n=sc.nextInt();
        for(int i=0;i<10001;i++)
            adj[i] = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
           int a=sc.nextInt();
           int b=sc.nextInt();
           adj[a].add(b);
        }
        //int s=sc.nextInt();
        boolean vis[] = new boolean[1001];
        for(int i=0;i<1001;i++)
        vis[i]=false;
        GFG obj=new GFG();
        obj.bfs(1,adj,vis);
        System.out.println();
        }
    }
 
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

// Complete this function
class GFG
{
    public static void bfs(int s, ArrayList<Integer> adj[],boolean visited[])
    {
        //Add your code here.
        visited[s] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(q.size()!=0)
        {
            int t = q.remove();
            System.out.print(t+" ");
            Iterator<Integer> it = adj[t].listIterator();
            while(it.hasNext())
            {
                int i = it.next();
                if(!visited[i])
                {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}
