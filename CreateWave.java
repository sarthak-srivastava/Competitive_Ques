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
	int[] arr = {100,20, 21,20 ,19, 18, 17};
	createWave(arr);
	for(int i: arr)
		System.out.print(i + " "); 
	}
	public static void createWave(int[] arr)
	{
		for(int i = 1; i + 1<arr.length; i+=2)
		{
			if(arr[i - 1] > arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i-1] = temp;
					}
			if(arr[i + 1] > arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					}
			}
		}
}
