public class Solution {
    public int sqrt(int a) {
     long start = 0;
     long end = a;
     long ans = 0;
     if (a == 0 || a == 1)
            return a;
     while(start<=end)
     {   long mid = (start+end)/2;
         long sqr = mid*mid;
         if(sqr == a)
         return (int)mid;
         if (sqr<a)
         {start = mid+1;
         ans = mid;}
         else
         end = mid-1;
     }
     return (int)ans;
    }
}
