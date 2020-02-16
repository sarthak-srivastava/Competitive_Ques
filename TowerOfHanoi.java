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
		int num_disk = 3;
		TowerOfHanoi(num_disk, 'a','c','b'); // assuming the number of poles is fixed
	}
	public static void TowerOfHanoi(int n, char from, char to, char aux)
		{	

        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from + " to rod " + to); 
            return; 
        } 
        TowerOfHanoi(n-1, from, aux,to); 
        System.out.println("Move disk " + n + " from rod " +  from + " to rod " + to); 
        TowerOfHanoi(n-1, aux, to, from); 
    	} 
		
		
}
