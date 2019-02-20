class rodcutting
{
    public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        long start = System.currentTimeMillis();
        System.out.println("Maximum Obtainable Value (via simple recursion) is "+ 
                            cutRod(arr, size)); 
        long end = System.currentTimeMillis();
        System.out.println("And the time taken by simple recursive approach is : "+(end-start)+"ms");
  
        
        start = System.currentTimeMillis();
        System.out.println("Maximum Obtainable Value (via memoization) is "+ 
                            cutRodmemo(arr, size, new int[size+1])); 
        end = System.currentTimeMillis();
        System.out.println("And the time taken by memoization approach is : "+(end-start)+"ms");

        start = System.currentTimeMillis();
        System.out.println("Maximum Obtainable Value (via tabulation) is "+ 
                            cutRodTab(arr, size)); 
        end = System.currentTimeMillis();
        System.out.println("And the time taken by tabulation approach is : "+(end-start)+"ms");
  
    } 
    public static int cutRod(int[] prices, int n)
    {
        if(n<=0)
        return 0;
        int max_val = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            max_val = Integer.max(max_val,prices[i]+cutRod(prices,n-(i+1)));
        }
        return max_val;
    }
    public static int cutRodmemo(int[] prices, int n, int[] qb)
    {
        if(n<=0)
        return 0;
        if(qb[n]!=0)
        return qb[n];
        int max_val = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++)
        {
            max_val = Integer.max(max_val,prices[i]+cutRod(prices,n-(i+1)));
        }
        return qb[n] = max_val;
    }
    public static int cutRodTab(int[] prices, int n)
    {
        if(n<=0)
        return 0;
        int[] val = new int[n+1];
        for(int i = 1;i<=n;i++)
        {   int max_val = Integer.MIN_VALUE;
            for(int j = 0;j<i;j++)
            max_val = Integer.max(max_val,prices[j]+val[i-(j+1)]);
            val[i] = max_val;
        }
        return val[n];
    }

}