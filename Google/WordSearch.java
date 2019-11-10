class Solution {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        if(board == null || board.length == 0)
            return false;
        boolean ans = false;
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    ans = ans || dfs(board,i,j,new String(word),new HashSet<ArrayList<Integer>>());
                }
                if(ans == true)
                    return ans;
            }
        }
        return ans;
    }
    private boolean dfs(char[][] board, int i, int j, String word, HashSet<ArrayList<Integer>> hs)
    {   
        if(word.length() == 0)
            return true;
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || board[i][j]!=word.charAt(0))
            return false;
        // System.out.println(word + " " + i + " " + j);

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(i);
        ar.add(j);
        if(hs.contains(ar))
            return false;
        hs.add(ar);
        word = word.substring(1);
        boolean ans = dfs(board,i+1,j,word,hs) || dfs(board,i-1,j,word,hs) || dfs(board,i,j+1,word,hs) || dfs(board,i,j-1,word,hs); 
        if(ans == false)
            hs.remove(ar);
        return ans;
            
    }
}
