import java.util.*;
public class Boredom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // int[] arr = new int[n];
        
        long[] count = new long[100001];
        // ans[0] = 0;
        for(int i = 0; i<n;i++)
        {
            // arr[i] = ;
            count[sc.nextInt()]++;
        }
        long[] dp = new long[100001];
        
        // ans[1] = Long.max(arr[0],arr[1]);
        dp[0] = 0;
        dp[1] = count[1];
		for(int i = 2; i <=100000; i++){
			dp[i] = Long.max(dp[i-1], dp[i-2]+i*count[i]);
		}
		System.out.println(dp[100000]);
    }
}
