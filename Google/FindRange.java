public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    ans.add(-1);
	    ans.add(-1);
	    // find first occurence. If found, then find the last occurence
	    int l = 0;
	    int r = a.size() - 1;
	    while(l<=r)
	    {
	        int mid = (l+r)/2;
	        if(a.get(mid) == b)
	        {
	            ans.set(0,mid);
	            r = mid - 1;
	        }
	        else if(a.get(mid) > b)
	        r = mid - 1;
	        else
	        l = mid + 1;
	    }
	    if(ans.get(0) == -1)
	    return ans;
	    l = 0;
	    r = a.size() - 1;
	    while(l<=r)
        {
            int mid = (l+r)/2;
            if(a.get(mid) == b)
            {
                ans.set(1,mid);
                l = mid + 1;
            }
            else if(a.get(mid) > b)
            r = mid - 1;
            else
            l = mid + 1;
        }
	    
	    return ans;
	}
}
