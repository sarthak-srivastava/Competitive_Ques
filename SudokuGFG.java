import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     char[][] board = new char[9][9];
	     for(int i = 0;i<9;i++)
	     {
	         for(int j = 0;j<9;j++)
	         {
	             board[i][j] = sc.next().charAt(0);
	         }
	     }
	     System.out.println(isValidSudoku(board));
	 }
	 }
	 public static int isValidSudoku(char[][] board) {
		
		short[] rows = new short[9];
		short[] cols = new short[9];
		short[] squares = new short[9];
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[0].length; col++) {
				if(board[row][col] == '0') continue;
				
				short value = (short) (1 << (board[row][col] - '1'));
				
				if((value & rows[row]) > 0) return 0;
				if((value & cols[col]) > 0) return 0;
				if((value & squares[3*(row/3) + col/3]) > 0) return 0;
				
				rows[row] |= value;
				cols[col] |= value;
				squares[3*(row/3) + col/3] |= value;
			}
		}
		
		return 1;
}
}
