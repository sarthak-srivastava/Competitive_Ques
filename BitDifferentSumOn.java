public class Solution {
    public int cntBits(int[] arr) {
         long ans = 0; // Initialize result 
        int n = arr.length;
        // traverse over all bits 
        for (int i = 0; i < 32; i++) { 
              
            // count number of elements  
            // with i'th bit set 
            long count = 0; 
              
            for (int j = 0; j < n; j++) 
                if ((arr[j] & (1 << i)) == 0) 
                    count++; 
  
            // Add "count * (n - count) * 2"  
            // to the answer 
            ans += (count * (n - count) * 2); 
        } 
          
        return (int)(ans%(1000000000+7)); 
}
}
