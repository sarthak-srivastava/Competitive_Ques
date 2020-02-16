/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Stack<Integer> stk = new Stack<Integer>();
		for(int i = 1; i<=10; i++)
			stk.push(i);
		DeleteMiddle(stk,0, stk.size());
		while(stk.size()>0)
		System.out.println(stk.pop() + " " );
	}
	public static void DeleteMiddle(Stack<Integer> stk, int curr, int n)
	{
		if(stk.size() == 0 || curr == n)
		{
			return;
			}
		int temp = stk.pop();
		DeleteMiddle(stk,curr+1, n);
		if(curr != n/2)	
		stk.push(temp);
		return;
 
		}
}
