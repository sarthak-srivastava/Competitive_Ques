class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        if(n <= 2)
            return true;
        boolean temp = isPowerOfTwo(n/2);
        if(temp == true && n%2!=0)
            return false;
        if(temp == false)
            return false;
        return true;
        
    }
}
