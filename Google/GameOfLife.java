class Solution {
    public void gameOfLife(int[][] board) {
    if(board == null || board.length==0)
            return;
    HashMap<ArrayList<Integer>,Integer> hm = new HashMap<>();
        for(int i = 0; i<board.length; i++)
        {
            for(int j = 0; j<board[i].length;j++)
            {   int neighborCount = 0;
                for(int k = -1;k<=1;k++)
                {
                    for(int l = - 1;l<=1;l++)
                    {
                        if(k == 0 && l == 0)
                            continue;
                        int r = i + k;
                        int c = j + l;
                        if( r < 0 || r>= board.length || c<0 || c>= board[0].length)
                            continue;
                        neighborCount += board[r][c];
                    }
                }
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                arr.add(j);
                hm.put(arr,neighborCount);
            }
        }
        
        for(int i = 0; i<board.length;i++)
        {
            for(int j = 0; j<board[0].length;j++)
            {   ArrayList<Integer> arr = new ArrayList<>();
                arr.add(i);
                arr.add(j);
                int neighborCount = hm.get(arr);
                if(board[i][j] == 1 && neighborCount<2)
                    board[i][j] = 0;
                if(board[i][j] == 1 && (neighborCount == 2 || neighborCount == 3) )
                    continue;
                if(board[i][j] == 1 && neighborCount>3)
                    board[i][j] = 0;
                if(board[i][j] == 0 && neighborCount == 3)
                    board[i][j] = 1;
            }
        }
    }
}
