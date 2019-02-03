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
	     int en=Integer.MAX_VALUE,ei=Integer.MAX_VALUE,on=str.charAt(str.length()-1)-'0',oi=str.length()-1;
	    for(int i =0;i<str.length();i++)
	    {
	        int ch = str.charAt(i)-'0';
	       //System.out.println(ch);
	        if(ch%2==0)
	        {en = ch;
	        ei = i;
	           // System.out.println("Even num selected is "+en+" at: "+ei);
	        }
	        if(en<=on)
	        break;
	    }
	    if(ei<Integer.MAX_VALUE)
	    {
	        System.out.println(str.substring(0,ei)+on+str.substring(ei+1,oi)+en);
	    }
	    else
	     {
	         System.out.println(str);
	     }
	     
	 }
	 }
}
