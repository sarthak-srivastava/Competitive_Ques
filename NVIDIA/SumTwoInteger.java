class Solution {
    public int getSum(int a, int b) {
        if(a == 0 || b == 0)
            return a|b;
        int carry = 0;
        while(b!=0)
        {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
        
    }
}
