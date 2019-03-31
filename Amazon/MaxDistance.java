public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {
        int ans = 0;
        int[] left = new int[a.size()];
        int[] right = new int[a.size()];
        left[0] = a.get(0);
        for(int i = 1;i<a.size();i++)
        left[i] = Integer.min(a.get(i),left[i-1]);
        right[a.size()-1] = a.get(a.size()-1);
        for(int i = a.size()-2;i>=0;i--)
        right[i] = Integer.max(a.get(i),right[i+1]);
        int i = 0;
        int j = 1;
        while(i<a.size() && j<a.size())
        {
            if(left[i]<=right[j])
            {
                ans = Integer.max(ans,j-i);
                j++;
            }
            else
            i++;
        }
        return ans;
        
    }
}
