import java.util.*;
class CountMazePathDP2
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    


    System.out.println(totalMazePath(n,n, new int[n+1][n+1]));
}
public static int totalMazePath(int dr, int dc, int[][] qb)
{   
    for(int r = dr; r>=0; r--)
    {
        for(int c = dc;c >=0; c--)
        {
            if(r == dr && c == dc)
            qb[r][c] = 1;
            else if(r == dr )
            qb[r][c] += qb[r][c+1];
            else if(c == dc)
            qb[r][c] += qb[r+1][c];
            else
            qb[r][c] += qb[r+1][c]+qb[r][c+1];
        }
    }
    return qb[0][0];
}
}
