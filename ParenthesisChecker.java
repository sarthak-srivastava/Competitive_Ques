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
		{   int b1 = 0, b2 = 0, b3 = 0;
		    String s = sc.next();
		    for(int i = 0; i<s.length();i++)
		    {
		        if(s.charAt(i)=='[')
		            b1++;
		        if(s.charAt(i)==']')
		            b1--;
		        if(s.charAt(i)=='(')
		            b2++;
		        if(s.charAt(i)==')')
		            b2--;
		        if(s.charAt(i)=='{')
		            b3++;
		        if(s.charAt(i)=='}')
		            b3--;
		                  
		    }
		    if(b1==0 && b2==0 && b3==0)
		    System.out.println("balanced");
		    else
		    System.out.println("not balanced");
		}
	}
}
