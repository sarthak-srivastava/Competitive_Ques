import java.util.*;
class Fibonacci{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] qb = new long[n+1];
        System.out.println(Fibm(n - 1,qb));
        System.out.println(Fibt(n-1));
    }
    public static long Fibm(int n, long[] qb)
    {
        if(n == 0 || n == 1)
        return n;
        if(qb[n] != 0)
        return qb[n];
        long ans = Fibm(n-1,qb) + Fibm(n-2, qb);
        qb[n] = ans;
        return qb[n];
    }
    public static int Fibt(int n)
    {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2;i<=n;i++)
        f[i] = f[i-1]+f[i-2];
        return f[n];
    }
}