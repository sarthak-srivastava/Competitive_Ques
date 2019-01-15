import java.util.*;
class mainiques {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if(n%2==0)
        printSeq(n-1,flag, n);
        else
        printSeq(n,flag, n);
    }
    public static void printSeq(int n, int flag, int org)
    {   if(n>org)
        return;
        if(n<=0)
        {   n += 1;
            flag = 1;
        }
        if (flag == 0)
        {   if(n>0)
            System.out.println(n);
            printSeq(n-2,flag,org);
        }
        if (flag == 1)
        {
            if(n>0)
            System.out.println(n);
            printSeq(n+2,flag,org);
        }
    }
}