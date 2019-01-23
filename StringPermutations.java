/* 
Given a string, print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA */


/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    String s = sc.next();
		    ArrayList<String> h = new ArrayList<String>();
		    printPermutations(s,"",h);
		    Collections.sort(h);
		    for(int i=  0; i<h.size();i++)
		    System.out.print(h.get(i)+" ");
		    System.out.println();
		}
	}
	public static void printPermutations(String ques, String asf,ArrayList<String> h)
	{
	    if(ques.length() == 0)
	    {
	        
	        h.add(asf);
	    }
	    for(int i = 0; i<ques.length();i++)
	    {
	        char ch = ques.charAt(i);
	        String left = ques.substring(0,i);
	        String right = ques.substring(i+1);
	        String roq = left+right;
	        printPermutations(roq, asf+ch,h);
	        
	    }
	    
	}
}
