public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) { 
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int dimension = a.size();
        for (int i = 0; i < dimension*2-1; i++) {
            result.add(getDiagonal(i, a));
        }
        return result;
    }
    
    public ArrayList<Integer> getDiagonal(int layer, ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= layer; i++) {
            int j = layer-i;
            if (i < a.size() && j < a.size()) {
                 result.add(a.get(i).get(j));
            }
        }
        return result;
    }
}
