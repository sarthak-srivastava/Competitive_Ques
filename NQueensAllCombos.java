import java.io.*;

class GFG {
	public static void main (String[] args) {
		boolean[][] chess = new boolean[4][4];
		printNQueens(chess,0,"",-1);
	}
	static int counter = 0;
	public static void printNQueens(boolean[][] chess, int tqps,String ppq, int lpqi )
	{
	    if(tqps == chess.length)
	    {counter ++;
	        System.out.println(counter+" ." + ppq);
	        return;
	    }
	    else
	    {
	        for(int i = lpqi+1; i<chess.length*chess[0].length; i++)
	        {   int row = i/chess.length;
	            int column  = i%chess[0].length;
	            if(chess[row][column]==false)
	            {   chess[row][column]=true;
	                printNQueens(chess,tqps+1,ppq+"Q."+(tqps+1)+"B."+i+" ",i);
	                chess[row][column]=false;
	            }
	        }
	    }
	}
}
