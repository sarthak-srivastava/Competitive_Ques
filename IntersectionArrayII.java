class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i = 0;i<nums1.length;i++)
        {   if(!hs.containsKey(nums1[i]))
            hs.put(nums1[i],1);
            else
            {
                int f = hs.get(nums1[i]);
                hs.remove(nums1[i]);
                hs.put(nums1[i],f+1);
            }
        }
        for(int j = 0;j<nums2.length;j++)
        {
            if(hs.containsKey(nums2[j]) && hs.get(nums2[j])>0)
            {  // {   if(!h.contains(nums2[j]))
            arr.add(nums2[j]);
            hs.put(nums2[j],hs.get(nums2[j])-1);
        
            }
                   }
        int[] ans = new int[arr.size()];
        for(int i = 0;i<arr.size();i++)
            ans[i] = arr.get(i);
    return ans;
    }
}
