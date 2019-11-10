class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x+y<z)
            return false;
        if(x == z || y == z || (x+y == z))
            return true;
        return z%gcd(x,y) == 0;
    }
    private int gcd(int a, int b)
    {   if(a == 0 || b == 0)
            return Integer.max(a,b);
        int divisor = Integer.min(a,b);
        int dividend = a+b - divisor;
        while(dividend%divisor!=0)
        {
            int rem = dividend%divisor;
            dividend = divisor;
            divisor = rem;
        }
     return divisor;
    }
}
