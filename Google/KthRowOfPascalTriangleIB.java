public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> curr = new ArrayList<Integer>();
        curr.add(1);
        if(A == 0)
            return curr;
        curr.add(1);
        if(A == 1)
            return curr;
        for(int i = 2; i <= A; i++)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < curr.size() ;j++)
            temp.add(curr.get(j) + curr.get(j - 1));
            temp.add(1);
            curr = temp;
            
        }
        return curr;
    }
}
