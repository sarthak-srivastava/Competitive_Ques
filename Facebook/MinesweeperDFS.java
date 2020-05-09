public class Solution {
    /**
     * @param board: a board
     * @param click: the position
     * @return: the new board
     */
    public char[][] updateBoard(char[][] board, int[] click) {
        // Write your code here
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }
        else
            {
                /* This is the case of 'E'
                2 cases can be: No surrounding mine
                                some number of mines in surrounding
                                
                So, let's start counting in the neighbor
                */
                int count = 0;
                for(int i = -1; i<2; i++)
                {
                    for(int j = -1; j<2; j++)
                    {
                        if(i == 0 && j == 0)
                            continue;
                        int row = i + click[0];
                        int col = j + click[1];
                        if(row <0 || row >= board.length || col < 0 || col >= board[0].length)
                            continue;
                        if(board[row][col] == 'M')
                            count++;
                            
                    }
                }
                if(count > 0)
                {
                    board[click[0]][click[1]] = (char)(count + '0');
                    return board;
                }
                else
                {
                    board[click[0]][click[1]] = 'B';
                    for(int i = -1; i<2; i++)
                {
                    for(int j = -1; j<2; j++)
                    {
                        if(i == 0 && j == 0)
                            continue;
                        int row = i + click[0];
                        int col = j + click[1];
                        if(row <0 || row >= board.length || col < 0 || col >= board[0].length)
                            continue;
                        if(board[row][col] == 'E')
                            updateBoard(board,new int[]{row,col});
                            
                    }
                }
                }
                
            }
            return board;
    }
}
