import java.util.*;
class nKnights {
    public static void main(String[] args)
    {
        boolean[][] chess = new boolean[4][4];
        nKnightsPrint(chess,0,"",-1);
    }
    static int counter = 0;
    public static void nKnightsPrint(boolean[][] chess,int qpsf, String psf, int lqpb)
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
                if(isKnightSafe(chess,row,column) == true)
                {   chess[row][column] = true;
                    nKnightsPrint(chess,qpsf+1,psf+"K."+(qpsf+1)+"P."+"("+row+","+column+") ",b);
                    chess[row][column] = false;

                }
        }
        }
    }
}
    public static boolean isKnightSafe(boolean[][] chess,int row, int column)
    {int[][] dir = {{2,-1},{2,+1},{1,-2},{-1,-2},{-2,1},{-2,-1},{-1,2},{-1,-2}};
    
    
        for(int i = 0;i<dir.length;i++)
        {
            int r = row + dir[i][1];
            int c = column + dir[i][0];
            if(r<0 || r>=chess.length || c < 0 || c >= chess.length)
            continue;
            if (chess[r][c] == true)
            return false;
        }
    
    return true;}
}