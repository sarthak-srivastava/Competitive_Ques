import java.util.HashSet;
public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Collections.sort(a);
        HashSet<ArrayList<Integer>> h = new HashSet<ArrayList<Integer>>();
        return combinationSumUtil(a,b,ans,new ArrayList<Integer>(), -1,0,h);
    }
    public ArrayList<ArrayList<Integer>> combinationSumUtil(ArrayList<Integer> a, int b, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> tmp,int li,int ssf,HashSet<ArrayList<Integer>> h)
    {
        if(ssf == b)
        {
            ArrayList<Integer> t = new ArrayList<Integer>(tmp);
            if(!h.contains(t))
            {   h.add(t);
                ans.add(t);
                return ans;
            }
        }
        if(ssf>b)
        {
            return ans;
        }
        else
        {
            for(int i = li+1;i<a.size();i++)
            {   tmp.add(a.get(i));
                combinationSumUtil(a,b,ans,tmp,i,ssf+a.get(i),h);
                tmp.remove(tmp.size()-1);
            }
        }
        return ans;
    }
    
}
