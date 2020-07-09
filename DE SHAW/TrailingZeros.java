public class Solution {
    public int solve(int A) {
        if(A%2 !=0)
        return 0;
        int ans = 0;
        for(int i = 0; i<32; i++)
        {
            if(((A>>i) & 1) == 0)
                ans++;
            else
                break;
        }
        return ans;
    }
}
