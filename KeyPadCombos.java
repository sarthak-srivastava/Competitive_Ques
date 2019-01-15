import java.util.*;
public class KeyPadCombos
{
 static String[] key = {".","abc","def","ghi","jkl","mno","pqr","st","uvwx","yz"};
public static void main(String[] args)
{
    
    System.out.println(getKPC("179"));
    
}
public static ArrayList<String> getKPC(String str)
{   if(str.length()==0)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("");
        return a;
    }
    char ch = str.charAt(0);
    String ros = str.substring(1);
    ArrayList<String> rr = getKPC(ros);
    ArrayList<String> mr = new ArrayList<String>();

    for(String rstr:rr)
    {
        String code = key[ch - '0'];
        for(int i = 0; i<code.length();i++)
        {
            char chcode = code.charAt(i);
            mr.add(chcode+rstr);
        }
    }
    return mr;
}
}