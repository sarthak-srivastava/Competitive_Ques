import java.util.*;
class CountBoardPathDP
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int src = sc.nextInt();
        int des = sc.nextInt();
        System.out.println(printcbp(src,des,new int[des+1]));
    }
    public static int printcbp(int src, int des, int[] qb)
    {
        if(src>des)
        return 0;
        if(src == des)
        return 1;
        if(qb[src]!=0)
        return qb[src];
        int tcbp = 0;
        for(int i = 1;i<=6;i++)
        {
            int cbp = printcbp(src + i, des , qb);
            tcbp += cbp;
        }
        qb[src] = tcbp;
        return qb[src];
    }
}