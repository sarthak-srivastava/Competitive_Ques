import java.util.*;
public class Toggle
{
    public static void main(String[] agrs)
    {   Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Toggle Case: "+toggleCase(s));
    }
    public static String toggleCase(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ; i<sb.length(); i++)
        {
            char ch = sb.charAt(i);
            if(ch>'a' && ch<'z')
            {
                ch = (char)(ch - 'a' + 'A');
            }
            else
            ch = (char)(ch-'A'+'a');
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }



}