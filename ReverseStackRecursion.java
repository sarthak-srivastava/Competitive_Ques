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
	int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9};
	Stack<Integer> stk = new Stack<Integer>();
	for(int i:arr)
	stk.push(i);
	reverseStack(stk,new Stack<Integer>());
	while(stk.size() > 0)
	{
		System.out.print(stk.pop() + " ");
		}
	
	}
	public static void reverseStack(Stack<Integer> stk, Stack<Integer> aux)
	{
		if(stk.size() == 0)
			return;
		aux.push(stk.pop());
		reverseStack(stk,aux);
		stk.push(aux.pop());
		return;
		}
}
