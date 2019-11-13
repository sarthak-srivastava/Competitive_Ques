class Solution {
    public void solve(char[][] board) {
     if(board == null || board.length == 0)
         return;
       char[][] copy_board = new char[board.length][board[0].length];
        for(int i = 0; i<board.length;i++)
        {
            if(board[i][0] == 'O')
                solveHelper(board,i,0);
            if(board[i][board[0].length - 1] == 'O')
                solveHelper(board,i,board[0].length - 1);
        }
         for(int i = 0; i<board[0].length;i++)
        {
            if(board[0][i] == 'O')
                solveHelper(board,0,i);
            if(board[board.length - 1][i] == 'O')
                solveHelper(board,board.length - 1,i);
        }
        
        
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[0].length ; j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'Y')
                    board[i][j] = 'O';
                    
            }
        }
       
        
    }
    public void solveHelper(char[][] board,int i, int j)
    {
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='O')
            return;
        board[i][j] = 'Y';
        solveHelper(board,i+1,j);
        solveHelper(board,i-1,j);
        solveHelper(board,i,j+1);
        solveHelper(board,i,j - 1);
    }
}
