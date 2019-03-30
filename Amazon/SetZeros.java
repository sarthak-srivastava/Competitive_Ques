public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
          int rows = a.size();
        int cols = a.get(0).size();
        
        Set<Integer> zeroRows = new HashSet<>();
        Set<Integer> zeroCols = new HashSet<>();
        
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                if (a.get(row).get(col) == 0) {
                    zeroRows.add(row);
                    zeroCols.add(col);
                }
            }
        }
        
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                if (zeroRows.contains(row) || zeroCols.contains(col))
                    a.get(row).set(col, 0);
            }
        }
    }
}
