public class Solution {
    public int uniquePaths(int A, int B) {
        if(A==1||B==1)
        return 1;
        return uniquePaths(A-1,B)+uniquePaths(A,B-1);
    }
}
