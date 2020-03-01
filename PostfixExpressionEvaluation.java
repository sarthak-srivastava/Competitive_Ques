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
	     Stack<Integer> stk = new Stack<Integer>();
	     String temp = "";
	     for(int i = 0; i<str.length();i++)
	     { 
	         char ch = str.charAt(i);
	         int a1, a2;
	        
	        if(!Character.isDigit(ch))
	        { a1 = stk.pop();
	         a2 = stk.pop();
	         switch(ch)
	            { case '+':
	                  
	                 stk.push(a1 + a2);
	                 break;
	              case '-':
	                 
	                 stk.push(a2 - a1);
	                 break;
	             case '/':
	                 
	                 stk.push(a2/a1);
	                 break;
	             case '*':
	               
	                 stk.push(a1 * a2);
	                 break;
	            
	                 
	     }
	        }
	     else
	     stk.push(ch - '0');
	     }
	     	     System.out.println(stk.pop());

	 }
	 }
}
