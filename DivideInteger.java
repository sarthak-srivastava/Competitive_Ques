public class Solution {
    public int divide(int A, int B) {
        long p = Math.abs((long)A);
        long q = Math.abs((long)B);
        
        long result = 0;
        
        while(p >= q){
            int counter = 0;
            
            while(p >= (q << (counter))){
                counter++;
            }
            
            result += 1 << (counter - 1);
            
            p -= q << (counter - 1);
        }
        
        if(A == Integer.MIN_VALUE && B == -1)
            return Integer.MAX_VALUE;
        if(A == Integer.MIN_VALUE && B == 1)
            return Integer.MIN_VALUE;
        // if(result < Integer.MIN_VALUE)
        //     return Integer.MIN_VALUE;
        // if(result > Integer.MIN_VALUE)
        //     return Integer.MIN_VALUE;
        if((A > 0 && B > 0) || (A < 0 && B < 0))
            return (int)result;
        return (int)(-1 * result);
    }
}
