/* 
Given an array of integers A and a sum B, find all unique combinations in A where the sum is equal to B.

ach number in A may only be used once in the combination.

Note:
   All numbers will be positive integers.
   Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
   The combinations themselves must be sorted in ascending order.
   If there is no combination possible the print "Empty" (without qoutes).
Example,
Given A = 10,1,2,7,6,1,5 and B(sum) 8,

A solution set is:

[1, 7]
[1, 2, 5]
[2, 6]
[1, 1, 6]

Input:
First is T , no of test cases. 1<=T<=500
Every test case has three lines.
First line is N, size of array. 1<=N<=12
Second line contains N space seperated integers(x). 1<=x<=9.
Third line is the sum B. 1<=B<=30.
 
Output:
One line per test case, every subset enclosed in () and in every set intergers should be space seperated.(See example)

Example:
Input:
2
7
10 1 2 7 6 1 5
8
5
8 1 8 6 8
12

Output:
(1 1 6)(1 2 5)(1 7)(2 6)
Empty
*/



/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class CombinationSum {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i= 0; i<n; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int tar = sc.nextInt();
		    printSubset(arr,tar,0,"",-1);
		    System.out.println();
		}
	}
	public static void printSubset(int[] arr, int t,int ssf, String ans, int i)
	{
	    if(ssf == t)
	    {   
	        
	        System.out.print("(");
	        System.out.print(ans);
	        System.out.print(")");
	        return;
	    }
	    else if(ssf>t)
	    {
	    return;}
	    else if((i+1)<arr.length){
	        printSubset(arr,t,ssf+arr[i+1],ans+" "+Integer.toString(arr[i+1]),i+1);
	        printSubset(arr,t,ssf,ans,i+1);
	    }
	    else
	    return;
	    }
	}
