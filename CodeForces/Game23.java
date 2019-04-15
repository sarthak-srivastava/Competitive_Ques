import java.util.*;
public class Game23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(numsteps(n,m,0));
    }
    public static int numsteps(int n, int m, int steps)
    {
        if(n>m)
        return -1;
        if(n == m)
        return steps;
        int a = numsteps(n*2,m,steps+1);
        int b = numsteps(n*3,m,steps+1);
        if(a>0)
        return a;
        else
        return b;
        
    }
}