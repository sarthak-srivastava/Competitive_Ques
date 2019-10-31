public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int r = a.size();
        int c = a.get(0).size();
        for(int i = 0;i<r;i++)
        {
            for(int j = i;j<c;j++)
            {
                int t = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,t);
            }
        }
        for(int i = 0;i<r;i++)
        {
            int j = 0;
            int k = r-1;
            while(j<k)
            {   int t = a.get(i).get(j);
                a.get(i).set(j,a.get(i).get(k));
                a.get(i).set(k,t);
                j++;
                k--;
            }
        }
    }
}
