import java.util.*;
public class StringTask
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> hs = new HashSet<Character>();
        hs.add('A');
        hs.add('a');
        hs.add('E');
        hs.add('e');
        hs.add('I');
        hs.add('i');
        hs.add('O');
        hs.add('o');
        hs.add('U');
        hs.add('u');
        hs.add('Y');
        hs.add('y');
        String ans = "";
        for(int i = 0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(hs.contains(ch))
            continue;
            if(ch>=65 && ch<=90)
            ch = (char)(ch+32);
            ans = ans+"."+ch;
        }
        System.out.println(ans);
    }
}