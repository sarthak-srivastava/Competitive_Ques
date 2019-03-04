import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {  int flag = 0;
	     int n = sc.nextInt();
	     for(int i = 1;i<n;i++)
	     {  int setbit = 0;
	         int x = i;
	         while(x!=0)
	         {
	             x = x&(x-1);
	             setbit++;
	         }
	         if(i+setbit == n)
	         {  flag = 1;
	           //  System.out.println(i+" Number of Set bits:"+setbit);
	             System.out.println("0");
	             break;
	         }
	     }
	     if(flag == 0)
	     System.out.println("1");
	 }
	 }
}
