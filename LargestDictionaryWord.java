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
	     int dl = sc.nextInt();
	     String[] dict = new String[dl];
	     for(int i = 0;i<dl;i++)
	     dict[i] = sc.next();
	     String word = sc.next();
	     int l = 0;
	     String ans = "";
	     for(String w: dict)
	     {   
	         
	          int a =SubSequence(w,word); 
	             if(a>l)
	             {l = a;
	              ans = w;  
	             }
	             
	         
	     }
	     System.out.println(ans);
	 }
	 }
	  static int SubSequence(String str1, 
                                String str2)  
    { 
        int m = str1.length(), n = str2.length(); 
        // int l = 0;
        int j = 0; 
        for (int i = 0; i < n && j < m; i++) 
        { 
            if (str1.charAt(j) == str2.charAt(i))  
            { 
                j++;
                // l++;
            } 
        } 
    return j; 
    } 
}
