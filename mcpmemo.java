import java.util.*;
class mcpmemo{
    public static void main(String[] args)
    {
        int[][] costs = {{2,3,0,4},
                         {0,6,5,2},
                        {8,0,3,7},
                        {2,0,4,2}};
        System.out.println(mccp(0,0,costs.length-1,costs[0].length-1,costs,new int[costs.length][costs[0].length]));
    }
    public static int mccp(int sr,int sc, int dr, int dc,int[][] costs, int[][] qb)
    {   if(sr == dr && sc == dc)
        return costs[sr][sc];
        if(qb[sr][sc] != 0)
        return qb[sr][sc];
        int mcstod = 0;
        int mcihtod = Integer.MAX_VALUE;
        int mcivtod = Integer.MAX_VALUE;
        if(sr<dr){
            mcivtod = mccp(sr+1,sc,dr,dc,costs,qb);
        }
        if(sc<dc)
        {
            mcihtod = mccp(sr,sc+1,dr,dc,costs,qb);
        }
        mcstod = Integer.min(mcivtod,mcihtod) + costs[sr][sc];
        return qb[sr][sc] = mcstod;
    }
}