public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        System.out.println(n);
        for(int i  = 0;i<32;i++)
        {
            int curr = (n>>i)&1;
            System.out.print(curr > 0 ? 1 : 0);
            ans += curr  > 0 ? 1 : 0;
        }
        return ans;
    }
}
