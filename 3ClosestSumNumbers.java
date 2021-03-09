public class Solution {
    public int threeSumClosest(int[] A, int B) {
        if(A == null || A.length == 0)
            return 0;
        long ans = A[0] + A[1] + A[2];
        Arrays.sort(A);
        for(int i = 0; i<A.length-2; i++)
        {
            int j = i + 1; 
            
                int k = A.length - 1;
                while(j<k){
                long sum = A[i] + A[j] + A[k];
                // System.out.println(A[i] + " " + A[j] + " " + A[k] + " " + sum);
                if(Math.abs(sum - B) < Math.abs(ans - B)) ans = sum;
                // System.out.println(sum);
                if(sum < B )
                    j++;
                else
                    k--;
                    
                
            }
        }
        return (int)ans;
            
    }
}
