import java.util.*;
class CountMazePathDP
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    


    System.out.println(totalMazePath(0,0,n,n, new int[n+1][n+1]));
}
public static int totalMazePath(int sr, int sc, int dr, int dc, int[][] qb)
{   
    if(sr>dr || sc>dc)
    return 0;
    if(sr == dr && sc == dc)
    return 1;
    if(qb[sr][sc]!=0)
    return qb[sr][sc];
    int cstod = 0;
    int cihtod = totalMazePath(sr, sc+1, dr, dc, qb);
    int civtod = totalMazePath(sr+1, sc, dr, dc, qb);

    qb[sr][sc] = cihtod + civtod;

    return qb[sr][sc];
}
}
