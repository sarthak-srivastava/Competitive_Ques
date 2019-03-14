import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0){
	     int n=sc.nextInt(); int sum=sc.nextInt();
	     int[] a=new int[n];
	    
	     for(int i=0;i<n;i++){
	         a[i]=sc.nextInt();
	         
	     }
	   int start=0,sumf=a[0];
	   for(int i=1;i<=n;i++){
	       while(sumf>sum && start<i-1)
	       {
	           sumf=sumf-a[start];
	           start++;
	       }
	       if(sumf==sum)
	       {
	           System.out.println((start+1)+" "+i);
	           
	           break;
	           
	       }
	       if(i<n)
	       sumf+=a[i];
	   }
	 if(sumf!=sum)
	 System.out.println(-1);
	     
	 }
	 }
}
