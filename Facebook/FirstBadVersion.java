/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n<=0)
            return n;
        int beg = 1;
        int end = n;
        while(beg<end)
        {
            int mid = (beg)/2+(end)/2;
            if(isBadVersion(mid) == true && isBadVersion(mid-1)==false)
                return mid;
            if(isBadVersion(mid) == true && isBadVersion(mid-1)==true)
                end = mid - 1;
            else
                beg = mid+1;
        }
        return beg;
        
    }
}
