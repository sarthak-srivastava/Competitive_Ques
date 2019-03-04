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
	 {
	     int n = sc.nextInt();
	     System.out.println(numUtil(new int[n+1][2][3],n,1,2));
	   //  System.out.println(countStr(n,1,2));
	 }
	 }
	 static int countStr(int n,  
                    int bCount,  
                    int cCount) 
{ 
    // Base cases 
    if (bCount < 0 || cCount < 0) return 0; 
    if (n == 0) return 1; 
    if (bCount == 0 && cCount == 0) return 1; 
  
    // Three cases, we choose, a or b or c 
    // In all three cases n decreases by 1. 
    int res = countStr(n - 1, bCount, cCount); 
    res += countStr(n - 1, bCount - 1, cCount); 
    res += countStr(n - 1, bCount, cCount - 1); 
  
    return res; 
} 
	 public static int numUtil(int[][][] qb,int n, int numb, int numc)
	 {   
	     if(numb<0 || numc <0)
	        return 0; 
	        if(n == 0)
	        return 1;
	     if(numb == 0 && numc == 0)
	     return 1;
	     if(qb[n][numb][numc]!=0)
	     return qb[n][numb][numc];
	   //  int res = 0;
	     int res = numUtil(qb,n-1,numb,numc);
	     res += numUtil(qb,n-1,numb - 1,numc);
	     res += numUtil(qb,n-1,numb,numc - 1);
	     return qb[n][numb][numc] = res;
	 }
}
