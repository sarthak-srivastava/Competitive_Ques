class SnakeandLadder 
{

// Given a history of dice outcome, print if the player reaches board end or not
    public static void main(String[] args)
    {
        int[] snl = new int[21]; // snake and ladder of size 20
        snl[3] = 17;
        snl[7] = 11;
        snl[13] = 5;
        snl[19] = 2;
        int[] moves1 = {2, 5, 3, 4,6, 3, 4, 3, 5, 1, 2, 3};
        int[] moves2 = {2, 5, 3, 4,6, 3, 4, 3, 5, 1, 1, 6, 5, 2, 3, 5};
        PrintSnL(0,20,snl,moves1,0);
        PrintSnL(0,20,snl,moves2,0);
    }
    public static void PrintSnL(int src, int des, int[] snl, int[] moves, int mvidx) {
        if(src == des)
        {
            System.out.println("You Win!!");
            return;
        }
        if(mvidx == moves.length)
        {
            System.out.println(src);
            return;
        }
        if(src == 0)
        {
            if (moves[mvidx] == 1 || moves[mvidx] == 6)
            {
                src = 1;
                PrintSnL(src,des,snl,moves,mvidx+1);
            }
            else
            {
                PrintSnL(src,des,snl,moves,mvidx+1);
            }

        }
        else
        {
            if(snl[src]!=0)
            {
                src = snl[src];
                PrintSnL(src,des,snl,moves,mvidx);
            }
            else
            {
                src = src + moves[mvidx];
                if(src<=des)
                PrintSnL(src,des,snl,moves,mvidx+1);
                else
                PrintSnL(src-moves[mvidx],des,snl,moves,mvidx+1);
            }
        }
        
        
    }


}
