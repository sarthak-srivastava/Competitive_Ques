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
        int c = 0;
        for(int i = 0; i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(isIsland(a,i,j)>0)
                c++;
            }
        }
       return c;
    }
    public static int isIsland(int[][] a, int i, int j)
    {   int ans = 0;
    
        if(i>=0 && i<a.length && j>=0 && j<a[0].length && a[i][j] == 1)
        {   a[i][j] = 0;
            for(int l = i-1;l<=i+1;l++)
            {
                for(int m = j-1;m<=j+1;m++)
                {   
                    if(l!=m)
                    {
                        ans =  (1 + isIsland(a,i+l,j+m));
                    }
                }
            }
        }
        return ans;
        
    }
}
