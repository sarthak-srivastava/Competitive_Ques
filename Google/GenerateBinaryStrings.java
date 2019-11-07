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
	     String str = sc.next();
	     printCombos(str,0);
	     System.out.println();
	 }
	 }
	 public static void printCombos(String str, int i)
	 {
	     if(i == str.length() )
	     {
	         System.out.println(str + ' ');
	         return;
	     }
	     if(str.charAt(i) == '?')
	     {
	         printCombos(str.substring(0,i) + '0' + str.substring(i+1),i+1);
	         printCombos(str.substring(0,i) + '1' + str.substring(i+1),i+1);
	     }
	     else
	     {
	         printCombos(str,i+1);
	     }
	 }
}
