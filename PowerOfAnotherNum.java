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
	     if(isPower(sc.nextInt(),sc.nextInt()))
	     System.out.println(1);
	     else
	     System.out.println(0);
	 }
	 }
	 public static boolean isPower(int x, int y) 
    { 
        if (x == 1) 
            return (y == 1); 
  
 
        int pow = 1; 
        while (pow < y) 
            pow = pow * x; 
        return (pow == y); 
    } 
}
