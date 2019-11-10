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
                    ans = ans || dfs(board,i,j,new String(word));
                }
                if(ans == true)
                    return ans;
            }
        }
        return ans;
    }
    private boolean dfs(char[][] board, int i, int j, String word)
    {   
        if(word.length() == 0)
            return true;
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || board[i][j]!=word.charAt(0))
            return false;
        // System.out.println(word + " " + i + " " + j);

        ArrayList<Integer> ar = new ArrayList<>();
        char temp = board[i][j];
        board[i][j] = ' ';
        word = word.substring(1);
        boolean ans = dfs(board,i+1,j,word) || dfs(board,i-1,j,word) || dfs(board,i,j+1,word) || dfs(board,i,j-1,word); 
        board[i][j] = temp;
        return ans;
            
    }
}
