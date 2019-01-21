import java.util.*;
class CountBoardPathTab
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int src = sc.nextInt();
    int des = sc.nextInt();


    System.out.println(totalBoardPath(src,des,new int[des+1]));
}
public static int totalBoardPath(int src, int des, int[] qb)
{
    if(src > des)
    return 0;
    if(src == des)
    return 1;
    qb[des] = 1;
    for(int i = des-1; i>=src ; i--)
    {   for(int j = 1 ; j<= 6;j++)
        if(i + j <= des)
        qb[i] += qb[i+j];
    }
    return qb[src];
}
}
