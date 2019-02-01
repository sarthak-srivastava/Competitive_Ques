{
import java.io.*;
import java.util.Scanner;
class FindIslands
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][]a=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int p=sc.nextInt();
                    a[i][j]=p;
                }
            }
            GFG obj=new GFG();
            System.out.println(obj.findisland(a,n,m));
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


//Function should return the number of islands.
class GFG
{
       public static int findisland(int[][]a,int n,int m)
    {   
        //Add your code here.
        boolean visited[][] = new boolean[n][m]; 
  
  
        // Initialize count as 0 and travese through the all cells 
        // of given matrix 
        int count = 0; 
        for (int i = 0; i < n; ++i) 
            for (int j = 0; j < m; ++j) 
                if (a[i][j]==1 && !visited[i][j]) // If a cell with 
                {                                 // value 1 is not 
                    // visited yet, then new island found, Visit all 
                    // cells in this island and increment island count 
                    DFS(a, i, j, visited); 
                    ++count; 
                } 
  
        return count; 
        
    }
     static void DFS(int M[][], int row, int col, boolean visited[][]) 
    { 
        // These arrays are used to get row and column numbers 
        // of 8 neighbors of a given cell 
        int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1}; 
        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1}; 
  
        // Mark this cell as visited 
        visited[row][col] = true; 
  
        // Recur for all connected neighbours 
        for (int k = 0; k < 8; ++k) 
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited) ) 
                DFS(M, row + rowNbr[k], col + colNbr[k], visited); 
    }
    static boolean isSafe(int M[][], int row, int col, 
                   boolean visited[][]) 
    { 
        // row number is in range, column number is in range 
        // and value is 1 and not yet visited 
        return (row >= 0) && (row < M.length) && 
               (col >= 0) && (col < M[0].length) && 
               (M[row][col]==1 && !visited[row][col]); 
    } 

}
