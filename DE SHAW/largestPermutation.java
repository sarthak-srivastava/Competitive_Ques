public class Solution {
    public int[] solve(int[] arr, int k) {
        int n = arr.length;
        int pos[] = new int[n + 1]; 
  
        for (int i = 0; i < n; ++i) 
            pos[arr[i]] = i; 
  
        for (int i = 0; i < n && k > 0; ++i) { 
  
              if (arr[i] == n - i) 
                continue; 

            int temp = pos[n - i]; 
            pos[arr[i]] = pos[n - i]; 
            pos[n - i] = i; 
 
            int tmp1 = arr[temp]; 
            arr[temp] = arr[i]; 
            arr[i] = tmp1; 

            --k; 
    }
                return arr;
}
}
