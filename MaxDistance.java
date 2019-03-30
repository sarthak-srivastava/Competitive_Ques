public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] arr) {
        int maxDiff; 
        int i, j; 
        int n = arr.length;
  
        int RMax[] = new int[n]; 
        int LMin[] = new int[n]; 
  
        
        LMin[0] = arr[0]; 
        for (i = 1; i < n; ++i) 
            LMin[i] = Integer.min(arr[i], LMin[i - 1]); 
  
       
        RMax[n - 1] = arr[n - 1]; 
        for (j = n - 2; j >= 0; --j) 
            RMax[j] = Integer.max(arr[j], RMax[j + 1]); 
  
        
        i = 0; j = 0; maxDiff = Integer.MIN_VALUE; 
        while (j < n && i < n)  
        { 
            if (LMin[i] <= RMax[j])  
            { 
                maxDiff = Integer.max(maxDiff, j - i); 
                j = j + 1; 
            }  
            else 
                i = i + 1; 
        } 
  
        return maxDiff; 
    }
}
