public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(A==null || A.size()==0)
        return ans;
        ArrayList<Integer> curr = new ArrayList<Integer>();
        long curr_sum = 0;
        long overall_max = Integer.MIN_VALUE;
        for(int i = 0; i<A.size();i++)
        {   int curr_element = A.get(i);
            if(curr_element<0)
            {
                if(curr_sum>=overall_max)
                {
                    overall_max = curr_sum;
                 
                    ans = curr;
                    
                
                }
                   curr_sum = 0;
                   curr = new ArrayList<Integer>();
            
                    continue;
            }
            else
                {
                    curr_sum += curr_element;
                    curr.add(curr_element);
                }
        }
        if(curr_sum>overall_max)
                {
                    overall_max = curr_sum;
                    ans =curr;
                }
        return ans;
    }
}
