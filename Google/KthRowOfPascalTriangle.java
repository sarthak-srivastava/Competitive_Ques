public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        /*
                        1
                        1 1
                        1 2 1
                        1 3 3 1
                        1 4 6 4 1
        */
        // if element  is 1st element or last element, element is 1.
        
        for(int i = 0; i <= A; i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            for(int j = 0; j < i + 1; j++)
            {
                if(j == 0 || j == i)
                {
                    temp.add(1);
                }
                else
                {
                    temp.add(ans.get(j) + ans.get(j - 1));
                }
            }
            ans = temp;
        }
    return ans;
    }
    
}
