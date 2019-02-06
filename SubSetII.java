public class Solution {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans =new  ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        HashSet<ArrayList<Integer>> h = new HashSet<ArrayList<Integer>>();
        ans =  subsetWithDupUtil(A,ans,new ArrayList<Integer>(),-1,h);
        ArrayList<ArrayList<Integer>> result2 = new ArrayList<ArrayList<Integer>>();     
         for(ArrayList<Integer> list : ans){
                
                    result2.add(new ArrayList<Integer>(list));
            }
         Collections.sort(result2, new Comparator<ArrayList<Integer>>(){
             @Override
             public int compare(ArrayList<Integer> a, ArrayList<Integer> b){
                 for(int i = 0; i < Math.min(a.size(), b.size()); i++){
                     int cmp = Integer.compare(a.get(i), b.get(i));
                     if(cmp != 0)
                         return cmp;
                 }
                 return Integer.compare(a.size(), b.size());
             }
         });
         
        return result2;    
    }
    public ArrayList<ArrayList<Integer>> subsetWithDupUtil(ArrayList<Integer> A,ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> cset,int li,HashSet<ArrayList<Integer>> h)
    {   if(li>=A.size())
        return ans;
        if(li == A.size()-1)
        {
            ArrayList<Integer> t = new ArrayList<Integer>(cset);
            if(!h.contains(t)){
            ans.add(t);
            h.add(t);
            return ans;}
        }
        else
        {
            for(int i = li+1;i<A.size();i++)
            {   
               
                cset.add(A.get(i));
                subsetWithDupUtil(A,ans,cset,i,h);
                cset.remove(cset.size()-1);
                 subsetWithDupUtil(A,ans,cset,i,h);
            }
        }
        return ans;
    }
}
