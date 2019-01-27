public class Solution {
    public int[] dNums(int[] arr, int k) {
             // Creates an empty hashMap hM 
        HashMap<Integer, Integer> hM = 
                      new HashMap<Integer, Integer>(); 
        int[] ans = new int[arr.length - k +1];
        // initialize distinct element  count for 
        // current window 
        int dist_count = 0; 
  
        // Traverse the first window and store count 
        // of every element in hash map 
        for (int i = 0; i < k; i++) 
        { 
            if (hM.get(arr[i]) == null) 
            { 
                hM.put(arr[i], 1); 
                dist_count++; 
            } 
            else
            { 
               int count = hM.get(arr[i]); 
               hM.put(arr[i], count+1); 
            } 
        } 
  
        // Print count of first window 
        ans[0] = dist_count; 
  
        // Traverse through the remaining array 
        for (int i = k; i < arr.length; i++) 
        { 
  
            // Remove first element of previous window 
            // If there was only one occurrence, then 
            // reduce distinct count. 
            if (hM.get(arr[i-k]) == 1) 
            { 
                hM.remove(arr[i-k]); 
                dist_count--; 
            } 
            else // reduce count of the removed element 
            { 
               int count = hM.get(arr[i-k]); 
               hM.put(arr[i-k], count-1); 
            } 
  
            // Add new element of current window 
            // If this element appears first time, 
            // increment distinct element count 
            if (hM.get(arr[i]) == null) 
            { 
                hM.put(arr[i], 1); 
                dist_count++; 
            } 
            else // Increment distinct element count 
            { 
               int count = hM.get(arr[i]); 
               hM.put(arr[i], count+1); 
            } 
  
           // Print count of current window 
            ans[i-k+1] = dist_count; 
        } 
        return ans;
}
}
