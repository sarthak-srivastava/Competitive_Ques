public class Solution {
    static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();;
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
      ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        if(a == null || a.size() == 0)
            return result;
        Collections.sort(a);
        
        ArrayList<Integer> currentList = new ArrayList<Integer>();
        HashSet<ArrayList<Integer>> set = new  HashSet<ArrayList<Integer>>();
        combinationSum(a, b, 0, currentList, result, set);
           
        return result;
    }
    
    
    public static void combinationSum(ArrayList<Integer> a, int b,int j, ArrayList<Integer> currentList, ArrayList<ArrayList<Integer>> result,  HashSet<ArrayList<Integer>> set){
        if(b == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(currentList);
            if(!set.contains(temp)){
                set.add(temp);
                result.add(temp);
            }
            return;
        }
        
        for(int i = j; i < a.size(); i++){
            if(b < a.get(i))
                return;
            currentList.add(a.get(i));
            combinationSum(a, b - a.get(i), i, currentList, result, set);
            currentList.remove(currentList.size() - 1);
        }
    }
}
