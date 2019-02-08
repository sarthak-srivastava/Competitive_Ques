public class Solution {
    public int[] primesum(int n) {
         boolean isPrime[]=new boolean[n + 1]; 
        SieveOfEratosthenes(n, isPrime); 
        int[] ans = new int[2];
        for(int i = 2;i<n;i++)
        {   if(i>2 && i%2 ==0)
            continue;
            if(isPrime[i] && isPrime[n-i])
            {
                ans[0] = n-i;
                ans[1] = i;
            }
           
        } return ans;
    }
    // public boolean isPrime(int n)
    // {   int c = 0;
    // if(n <=1)
    // return false;
    //     for(int i = 2;i<Math.sqrt(n);i++)
    //     {
    //         if(n%i == 0)
    //         return false;
    //     }
    //     return true;
    // }
    static boolean SieveOfEratosthenes(int n, boolean isPrime[]) 
    { 
        // Initialize all entries of boolean 
        // array as true. A value in isPrime[i]  
        // will finally be false if i is Not a  
        // prime, else true bool isPrime[n+1]; 
        isPrime[0] = isPrime[1] = false; 
        for (int i = 2; i <= n; i++) 
            isPrime[i] = true; 
      
        for (int p = 2; p * p <= n; p++) 
        { 
            // If isPrime[p] is not changed,  
            // then it is a prime 
            if (isPrime[p] == true) 
            { 
                // Update all multiples of p 
                for (int i = p * 2; i <= n; i += p) 
                    isPrime[i] = false; 
            } 
        } 
        return false; 
    } 
}
