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
    if (n == 1)     {
    System.out.println("1");
    continue;
    } 
    if (n == 2)    {
    System.out.println("11");
    continue;
    } 
    String str = "11";  
    for (int i = 3; i <= n; i++) 
    { 
        int len = str.length(); 
        int cnt = 1;
        String tmp = "";
        char []arr = str.toCharArray(); 

        for (int j = 1; j <= len; j++) 
        { 
            if (j == len || arr[j] != arr[j - 1]) 
            { 
                tmp += cnt + 0; 
                tmp += arr[j - 1]; 
                cnt = 1; 
            } 

            else cnt++; 
        } 
          str = tmp; 
    } 
	     System.out.println(str);
	 }
	 }
}
