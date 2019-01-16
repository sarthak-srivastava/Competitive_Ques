class SnakeandLadder 
{
    public static void main(String[] args)
    {
        int n = 30;
        int[] board = new int[n];
        for(int i = 0; i<n; i++)
        //ladder
        board[i] = -1;
        board[2] = 21;
        board[4] = 7;
        board[10] = 25;
        board[19] = 28;
        //Snake
        board[26] = 0;
        board[20] = 8;
        board[16] = 3;
        board[18] = 6;

        System.out.println("Minimum number of controlled dice throws are: "+ MinimumDiceThrows(boards, n));
    }
    
}
