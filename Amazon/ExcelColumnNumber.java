public class Solution {
    public int titleToNumber(String A) {
        long ans = 0;
        while(A.length()>0)
        {
            ans = ans*26 + (A.charAt(0) - 'A'+1);
            A = A.substring(1);
        }
        return (int)ans;
    }
}
