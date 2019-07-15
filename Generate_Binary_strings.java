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
	     printCombos(str,"",0,new HashSet<String>());
	 }
	 }
	 public static void printCombos(String str, String s, int i,HashSet<String> h)
	 {
	     if(s.length() == str.length())
	     {
	        if(!h.contains(s))
	     {System.out.print(s+" ");
	        h.add(s);
	     }
	     
	         return;
	     }
	     
	         if(str.charAt(i) == '?')
	         {printCombos(str,s+'0',i+1,h);
	         printCombos(str,s+'1',i+1,h);
	         
	         }
	         
	       else  
	         printCombos(str,s+str.charAt(i),i+1,h);
	         
	     
	 }
}
