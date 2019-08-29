public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> arr) {
	    int count1 = 0, count2 = 0; 
          
  
        int first = Integer.MAX_VALUE; 
        int second = Integer.MAX_VALUE; 
        int n = arr.size();
        for (int i = 1; i < n; i++) { 
      
     
            if (first == arr.get(i)) 
                count1++; 
      
 
            else if (second == arr.get(i)) 
                count2++; 
          
            else if (count1 == 0) { 
                count1++; 
                first = arr.get(i); 
            } 
      
            else if (count2 == 0) { 
                count2++; 
                second = arr.get(i); 
            } 
      
    
            else { 
                count1--; 
                count2--; 
            } 
        } 
      
        count1 = 0; 
        count2 = 0; 
 
        for (int i = 0; i < n; i++) { 
            if (arr.get(i) == first) 
                count1++; 
      
            else if (arr.get(i) == second) 
                count2++; 
        } 
      
        if (count1 > n / 3) 
            return first; 
      
        if (count2 > n / 3) 
            return second; 
        if(arr.size() == 1)
        return arr.get(0);
        return -1; 
	}
}
