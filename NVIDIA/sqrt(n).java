class Solution {
    public int mySqrt(int x) {
        if(x <= 1)
            return x;
    int left = 1, right = Integer.MAX_VALUE;
    while (left <= right) {
        int mid = left + (right - left)/2;
        if (mid > x/mid) {
            right = mid - 1;
        } else {
            if (mid + 1 > x/(mid + 1))
                return mid;
            left = mid + 1;
        }
    }
        return left;
    }
}
