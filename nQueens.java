import java.util.*;
class nQueens {
    public static void main(String[] args)
    {
        boolean[][] chess = new boolean[4][4];
        nQueensPrint(chess,0,"",-1);
    }
    static int counter = 0;
    public static void nQueensPrint(boolean[][] chess,int qpsf, String psf, int lqpb)
    {
        if(qpsf == chess.length)
        {   counter++;
            System.out.println(counter+". "+psf);
            return;
        }
        else
        { for(int b = lqpb +1 ; b<chess.length*chess.length; b++ )
            {int row = b/chess.length;
                int column = b%chess.length;
            if(chess[row][column] == false)
            {   
                if(isQueenSafe(chess,row,column) == true)
                {   chess[row][column] = true;
                    nQueensPrint(chess,qpsf+1,psf+"Q."+(qpsf+1)+"P."+row+column+" ",b);
                    chess[row][column] = false;

                }
        }
        }
    }
}
    public static boolean isQueenSafe(boolean[][] chess,int row, int column)
    {int[][] dir = {{0,1},{0,-1},{1,1},{1,-1},{1,0},{-1,1},{-1,0},{-1,-1}};
    for(int i = 0;i<dir.length;i++)
    {
        for(int d = 1;2>1;d++)
        {
            int r = row + d * dir[i][1];
            int c = column + d * dir[i][0];
            if(r<0 || r>=chess.length || c < 0 || c >= chess.length)
            break;
            if (chess[r][c] == true)
            return false;
        }
    }
    return true;}
}