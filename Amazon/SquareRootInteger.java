public class Solution {
    public int sqrt(int a) {
         long low = 1;
        long high = a;
        while (low<=high) {
            long mid = (high + low) / 2;
            if (mid*mid == a) {
                return (int) mid;
            }
            if (mid*mid > a) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
       
        return (int) high;
    }
    }

