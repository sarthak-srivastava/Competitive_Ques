class GfG
{   
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
      // add code here.
      visited[v] = true;
      System.out.print(v + " ");
      for(int i = 0; i<adj[v].size(); i++)
      {
       if(!visited[adj[v].get(i)])
       {
           DFS(adj[v].get(i),adj,visited);
       }
      }
    }
}
