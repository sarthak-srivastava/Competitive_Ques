public class Solution {
    public int isPalindrome(int A) {
    String str = Integer.toString(A);
    for(int i = 0;i<str.length()/2;i++)
    {
        if(str.charAt(i)!=str.charAt(str.length()-i-1))
        return 0;
    }
    return 1;
    }
}
