class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length<=0)
            return 0;
        Arrays.sort(citations);
        // int beg = 0;
        int len = citations.length;
        int i;
        for (i = 0; i < citations.length; i++) {
            if ( len - i  <= citations[i])
                return len - i;
            // else
            //     len--;
        }
        return len - i;
    }
}
