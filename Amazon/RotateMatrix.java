public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int r = a.size();
        int c = a.get(0).size();
        for(int i = 0; i<r;i++)
        {
            for(int j =i+1; j<c;j++)
            {
                int temp = a.get(j).get(i);
                a.get(j).set(i,a.get(i).get(j));
                a.get(i).set(j,temp);
            }
        }
        for(int i = 0; i<a.size();i++)
        {
                int k = 0;
                int l = a.get(0).size()-k-1;
                while(k<l)
                {int temp = a.get(i).get(k);
                a.get(i).set(k,a.get(i).get(l));
                a.get(i).set(l,temp);
                k++;
                l--;
            }
        }
    }
}
