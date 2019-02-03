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
	     int d = sc.nextInt();
	     int m = sc.nextInt();
	     int y = sc.nextInt();
	     int q[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 }; 
             y -= (m < 3) ? 1 : 0; 
         int ans =  ( y + y/4 - y/100 + y/400 + q[m-1] + d) % 7;
         if(ans == 0)
         System.out.println("Sunday");
         if(ans == 1)
         System.out.println("Monday");
         if(ans == 2)
         System.out.println("Tuesday");
         if(ans == 3)
         System.out.println("Wednesday");
         if(ans == 4)
         System.out.println("Thursday");
         if(ans == 5)
         System.out.println("Friday");
         if(ans == 6)
         System.out.println("Saturday");
	 }
	 }
}
