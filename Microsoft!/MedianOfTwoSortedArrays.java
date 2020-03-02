class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s,l;
        if(nums1.length > nums2.length)
        {
            s = nums2.length;
            l = nums1.length;
            int[] t = nums1;
            nums1 = nums2;
            nums2 = t;
        }
        else
        {
            s = nums1.length;
            l = nums2.length;
        }
        int imin = 0;
        int imax = s;
        int half = ( s + l + 1)/2;
         while (imin <= imax) {
            int imid = (imin + imax) / 2;
            int j = half - imid;
            if (imid < imax && nums2[j-1] > nums1[imid]){
                imin = imid + 1; // i is too small
            }
            else if (imid > imin && nums1[imid-1] > nums2[j]) {
                imax = imid - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (imid == 0) { maxLeft = nums2[j-1]; }
                else if (j == 0) { maxLeft = nums1[imid-1]; }
                else { maxLeft = Math.max(nums1[imid-1], nums2[j-1]); }
                if ( (s + l) % 2 == 1 ) { return maxLeft; }

                int minRight = 0;
                if (imid == s) { minRight = nums2[j]; }
                else if (j == l) { minRight = nums1[imid]; }
                else { minRight = Math.min(nums2[j], nums1[imid]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
