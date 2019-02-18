import java.io.*;
import java.util.*;

public class Solution {

	public static boolean isValidSudoku(char[][] board) {
		
		short[] rows = new short[9];
		short[] cols = new short[9];
		short[] squares = new short[9];
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[0].length; col++) {
				if(board[row][col] == '.') continue;
				
				short value = (short) (1 << (board[row][col] - '1'));
				
				if((value & rows[row]) > 0) return false;
				if((value & cols[col]) > 0) return false;
				if((value & squares[3*(row/3) + col/3]) > 0) return false;
				
				rows[row] |= value;
				cols[col] |= value;
				squares[3*(row/3) + col/3] |= value;
			}
		}
		
		return true;
	}

	// public static void main(String[] args) {
	// 	char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},
	// 			{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},
	// 			{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},
	// 			{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
	// 	System.out.println(isValidSudoku(board));
	// }
}
