{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int nov = sc.nextInt();
            int edg  =sc.nextInt();
            for(int i = 0; i < nov; i++)
                list.add(i, new ArrayList<Integer>());
                
            for(int i = 1; i <= edg; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            boolean vis[] = new boolean[nov];
            for(int i = 0; i < nov; i++)
                vis[i] = false;
            new Traversal().dfs(0, list, vis);
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
*ArrayList<ArrayList<Integer>> list: which represents graph
* src: represents source vertex
*vis[]: boolean array 
*/
class Traversal
{
    static void dfs(int src, ArrayList<ArrayList<Integer>> list, boolean vis[])
    {
       // add your code here
       vis[src] = true;
       System.out.print(src+" ");
       for(int i:list.get(src))
       {
           if(!vis[i])
           {
               dfs(i,list,vis);
           }
       }
    }
}
