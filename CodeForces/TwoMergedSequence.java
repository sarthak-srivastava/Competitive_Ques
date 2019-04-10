import java.util.*;
public class TwoMergedSequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 0; i<n;i++)
        arr[i] = sc.nextInt();
        int inc = -1;
        int des = Integer.MAX_VALUE;
        for(int i = 0; i<n;i++)
        {
            if(inc<arr[i] && (arr[i]<arr[i+1] || arr[i]>=des))
            {
                inc = arr[i];
                arr[i] = 0;
            }
            else if (des>arr[i])
            {
                des = arr[i];
                arr[i] = 1;
            }
            else
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        for(int i = 0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}