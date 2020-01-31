public class Solution {
    public  int value(char r) 
    { 
        if (r == 'I') 
            return 1; 
        if (r == 'V') 
            return 5; 
        if (r == 'X') 
            return 10; 
        if (r == 'L') 
            return 50; 
        if (r == 'C') 
            return 100; 
        if (r == 'D') 
            return 500; 
        if (r == 'M') 
            return 1000; 
        return -1; 
    } 
    public int romanToInt(String A) {
        int res = 0;
        for(int i = 0; i<A.length(); i++ )
        {
            int curr =  value(A.charAt(i));
            {
                if(i + 1 < A.length())
                {
                    int next = value(A.charAt(i+1));
                    if(next <= curr)
                        res += curr;
                    else{
                        res += (next - curr);
                        i++;
                        
                    }
                }
                else{
                res += curr;
                
               
           }
            }
        }
        return res;        
    }
}
