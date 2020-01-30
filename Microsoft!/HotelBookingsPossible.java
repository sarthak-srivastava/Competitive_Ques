public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int c = 0;
        int i = 0; int j = 0;
        while(i<arrive.size()&& j<depart.size())
        {
            if(arrive.get(i)<depart.get(j))
            {c++;
            i++;
            
            }
            else
            {
                c--;
                j++;
            
            }
            if (c>K)
        return false;
            
        }
        
        
        return true;
    }
}
