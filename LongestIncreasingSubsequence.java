import java.util.*;
import java.lang.*;
import java.io.*;


		 
		       
class GFG {
       
	public static void main (String[] args) {
		Scanner in  =new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    int n = in.nextInt();
		    int[] a = new int[n];
		    for(int i =0; i<n;i++){
		       a[i] = in.nextInt();}
		       int[] lis = new int[n];
		       lis[0] = 1;
		  for(int i = 1; i<n;i++)
		  {
		      for(int j = 0;j<i;j++)
		      {
		          if(a[j]<a[i] && lis[j]>lis[i])
		          lis[i] = lis[j];
		      }
		      lis[i]++;
		  }
		  System.out.println(lis[n-1]);
	}	}
	}
