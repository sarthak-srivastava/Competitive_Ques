public class Solution {
    public int Mod(int A, int B, int C) { long res = 1;
        long y = A;
        
        while (B > 0) {
            
            if (B % 2 == 1) {
                res = res * y;
                res %= C;
            }
            
            y = y * y;
            y %= C;
            
            B /= 2;
            
        }
        
        res %= C;
        res = (res + C) % C;
        
        return (int) res;
    }
}
