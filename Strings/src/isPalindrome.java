import java.util.*;
public class isPalindrome {
	   public static void main(String[] args)
	    {   Scanner sc = new Scanner(System.in);
	        String s = sc.next();
	        System.out.println(Palindrome(s));
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
 
}
