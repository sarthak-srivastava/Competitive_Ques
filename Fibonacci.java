import java.util.*;
class Fibonacci{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] qb = new long[n+1];
        System.out.println(Fibm(n - 1,qb));
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

}