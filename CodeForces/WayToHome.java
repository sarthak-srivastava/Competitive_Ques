import java.util.*;
public class WayToHome
{   static int flag = 0;
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        String str = sc.next();
        int[] path = new int[n];
        for(int i = 0; i<n;i++)
        path[i] = str.charAt(i) - '0';
        min = Integer.MAX_VALUE;
        NumOfSteps(path,d,0,0);
        
        System.out.println(min);
        
    }

    
    public static void NumOfSteps(int[] path, int d, int steps,int j)
    {   if(j >path.length)
        {    
            return;
        }
        if(j == path.length - 1 && path[j] == 1)
        {   if(path[j] == 0)
            {
                System.out.println(-1);
                System.exit(0);
            }
            min = Integer.min(min,steps);
            return;
        }
        int flag2 = 0;
        for(int i = j+1;i<=j+d && i<path.length;i++)
        {   flag2 |= path[i];
            // if(i+d<path.length)
            if(path[i] == 1)
            {
                NumOfSteps(path,d,steps+1,i);
            }
            
        }
        if(flag2 == 0)
        {
            System.out.println(-1);
            System.exit(0);
        }
    }
}