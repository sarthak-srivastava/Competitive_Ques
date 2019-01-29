import java.util.*;
public class PalindromicSubstring {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = sc.next();
		System.out.println();
		int n = str.length();
		boolean[][] qb = new boolean[n][n];
		System.out.println("Total no. of possible palindromic substrings are: "+CountPalindromicSubstring(str,qb));
	}
	public static int CountPalindromicSubstring(String str, boolean[][]qb){
		int counter = 0;
		for(int diag=0;diag<str.length();diag++)
		{
			int si = 0;
			int ei = diag;
			while(ei<str.length())
			{
				if(diag == 0)
					qb[si][ei] = true;
				else if (diag == 1)
				{
					if(str.charAt(si)==str.charAt(ei))
						qb[si][ei] = true;
				}
				else
				{
					if(str.charAt(si) == str.charAt(ei) && qb[si+1][ei-1] == true)
					{
						qb[si][ei] = true;
					}
				}
			if(qb[si][ei]==true)
				counter++;
			si++;
			ei++;
			}
			
		}return counter;
			
		
}
}
