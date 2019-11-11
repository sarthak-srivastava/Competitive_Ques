public class Solution {
     public int cal(int[] temp)
    {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < temp.length; i++)
        {
            sum += temp[i];
            
            if(sum == 0)
                count++;
            
            if(map.containsKey(sum))
            {   
                count += map.get(sum);
                int val = map.get(sum);
                map.put(sum, val + 1);
            }
            else        
                map.put(sum, 1);
        }
        
        return count;
    }
    public int solve(int[][] A) {
        if(A == null || A.length == 0)
            return 0;
         int row = A.length;
        int col = A[0].length;
        
        int count = 0;
        
        for(int left = 0; left < col; left++)
        {
            int[] temp = new int[row];
            for(int right = left; right < col; right++)
            {
                for(int i = 0; i < row; i++)
                    temp[i] += A[i][right];
                    
                count += cal(temp);
            }
        }
        
        return count;
    }
}
