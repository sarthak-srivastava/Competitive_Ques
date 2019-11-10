class Solution {
    public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        if(board == null || board.length == 0)
            return false;
        // boolean ans = false;
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    if(dfs(board,i,j,0,word))
                        return true;
                }
                
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, int i, int j,int count, String word)
    {   
        if(word.length() == count)
            return true;
        if(i<0 || i>=board.length || j<0 || j>= board[0].length || board[i][j]!=word.charAt(count))
            return false;
        // System.out.println(word + " " + i + " " + j);

        
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean ans = dfs(board,i+1,j,count+1,word) || dfs(board,i-1,j,count+1,word) || dfs(board,i,j+1,count+1,word) || dfs(board,i,j-1,count+1,word); 
        board[i][j] = temp;
        return ans;
            
    }
}
