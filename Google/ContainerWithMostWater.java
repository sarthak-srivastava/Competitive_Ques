public class Solution {
    public int maxArea(int[] A) {
        int l = 0;
         int r = A.length - 1;
         int area = 0;
         while(l<r)
         {
             area  = Integer.max(area,((r - l) * Integer.min(A[l],A[r])));
             if(A[l]<A[r])
             l++;
             else
             r--;
         }
         return area;
    }
}
