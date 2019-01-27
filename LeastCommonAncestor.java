public class Solution {
    public int lca(TreeNode A, int B, int C) {
      if(A == null)
      return -1;
      if(B == C)
      {
          if(isPresent(A,B) && isPresent(A,C))
          return B;
          return -1;
          
      }
      if(A.val == B)
      {
          if(isPresent(A.left,C)||isPresent(A.right,C))
          return A.val;
          return -1;
          
      }
      if(isPresent(A,B) && isPresent(A,C))
      {
          if(isPresent(A.left,B)&&isPresent(A.left,C))
          return lca(A.left,B,C);
          
          if(isPresent(A.right,B)&&isPresent(A.right,C))
          return lca(A.right,B,C);
          
          return A.val;
      }
                return -1;

    }
    public boolean isPresent(TreeNode A, int B)
    {
        if(A == null)
        return false;
        if(A.val == B)
        return true;
        else 
        return isPresent(A.left,B)||isPresent(A.right,B);
    }
      
}
