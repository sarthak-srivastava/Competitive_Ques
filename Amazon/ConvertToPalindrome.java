public class Solution {
    public int solve(String A) {
        return isPalindrome(A, 0, A.length()-1, 0);
    }
    private int isPalindrome(String A, int i, int j, int flag)
    {   
        if(i >= j)
            return 1;
        if(A.charAt(i) == A.charAt(j))
        {
            return isPalindrome(A, i+1, j-1, flag);
        }
        if(flag == 1)
            return 0;
        return isPalindrome(A, i+1, j, 1)|isPalindrome(A, i, j-1, 1);
    }
}
