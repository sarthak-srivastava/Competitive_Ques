import java.util.*;
public class Bitpp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 0;
        while(t-->0)
        {
            String str = sc.next();
            for(int i = 0; i<str.length();i++)
            {
                char ch = str.charAt(i);
                if(ch == '+')
                {
                    x++;
                    break;
                }
                if(ch == '-')
                {
                    x--;
                    break;
                }
            }
        }
        System.out.println(x);
    }
}