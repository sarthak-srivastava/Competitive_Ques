import java.util.*;
public class MaximalContinuousRest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ga = 0;
        int ca = 0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            int t = sc.nextInt();
            arr[i] = t;
            if(t == 1)
            ca++;
            else
            {
                ga = Integer.max(ga,ca);
                ca = 0;
            }
        }
        for(int i = 0; i<n;i++)
        {
            if(arr[i] == 1)
            ca++;
            else
            break;
        }
        ga = Integer.max(ga,ca);
        System.out.println(ga);
    }
}