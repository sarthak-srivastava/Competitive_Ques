import java.util.*;
public class NextRound
{
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[101];
        for(int i = 0;i<n;i++)
        arr[sc.nextInt()]++;
        int ans = 0;
        for(int i = 100;i>0 && k>0;i--)
        {
            if(arr[i]>k)
                {ans += arr[i];
                 break;
                }
                else
                {
                    k = k-arr[i];
                    ans = ans + arr[i];
                }
        }
        System.out.println(ans);

    }
}