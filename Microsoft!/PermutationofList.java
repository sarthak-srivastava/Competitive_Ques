public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> num) {
    List<List<Integer>> result = new ArrayList<>();
    // ArrayList<Integer> al;
            // Collections.addAll(al, num); 
    ArrayList<Integer> num = new ArrayList<Integer>();
    for(int i: nums)
    num.add(i);
    ArrayList<Integer> temp = new ArrayList<Integer>();
    return permuteHelper(num,num.size(),result,temp);
}
 public List<List<Integer>> permuteHelper(ArrayList<Integer> num,int size,List<List<Integer>> result, ArrayList<Integer> temp)
 {
     if(size==0){
         result.add(new ArrayList<Integer>(temp));
     return result;}
     else
     {  
         for(int i = 0;i<num.size();i++)
         {
             temp.add(num.get(i));
             ArrayList<Integer> t = new ArrayList<Integer>(num);
             t.remove(i);
             permuteHelper(t,t.size(),result,temp);
             temp.remove(temp.size()-1);
         }
         return result;
     }
 }
}
