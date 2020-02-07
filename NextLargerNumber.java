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
	int[] arr1 = {11, 13, 21, 3, 42, 5};
	int[] arr2 = {4, 5, 2, 25, 7, 32, 8, 6};
    nextLarger(arr1);
	nextLarger(arr2);
}
	public static void nextLarger(int[] arr)
	{	if(arr == null || arr.length <=1 )
			return;
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(arr[arr.length - 1]);
		for(int i = arr.length - 2; i>=0; i--)
		{
			if(arr[i]<stk.peek())
		{	System.out.println(arr[i] + " -> " + stk.peek());
			stk.push(arr[i]);	
			continue;	
				}
 
		else if(stk.size() == 0)
			{
				System.out.println(arr[i] + " -> " );
				stk.push(arr[i]);
 
				}
		else
			{
				while(stk.size() > 0 && stk.peek()<arr[i])
				{
					stk.pop();
 
					}
				if(stk.size() >0)
				{
					System.out.println(arr[i] + " -> " + stk.peek());
 
					}
				else
					System.out.println(arr[i]+ " -> " );
				stk.push(arr[i]); 
				}
 
			}
		System.out.println();
	}
