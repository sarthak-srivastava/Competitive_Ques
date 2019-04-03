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
		int res = 0;
		int cur = 0;
		while(cur < n-1){
			int prev = cur;
			res++;
            for(int i = prev; i <= prev+d && i < n; i++) 
            {
                if(str.charAt(i) == '1') 
                cur = i;}
			    if(cur == prev) {
				res = -1;
				break;
			
        }
    }
		System.out.println(res);
    }
}