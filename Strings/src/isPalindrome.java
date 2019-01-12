import java.util.*;
public class isPalindrome {
	   public static void main(String[] args)
	    {   Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        printPalindromicSubstring(s);
	    }
    public static boolean Palindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)==s.charAt(right))
            {left++;
            right--;}
            else
            return false;
        }
        return true;
    }
    public static void printPalindromicSubstring(String s)
    {
        for(int i = 0; i< s.length();i++)
        {
            for(int j = i+1; j<=s.length();j++)
            {
                String temp = s.substring(i,j);
                if(Palindrome(temp) && temp.length()>1)
                System.out.println(temp);
            }
        }
    }
}
