
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    int x, l, h;
		    int amount = 0;
		    String L;
		    x = sc.nextInt();
		    
		    l = sc.nextInt();
		    h = sc.nextInt();
		    for(int j = 1; j < (h-l); j++){
		        L = Integer.toString(l+j);
		        for(int k = 0; k < L.length(); k++){
		            if(L.charAt(k) - '0' == x){
		                amount++;
		            } 
		        }
		    }
		    System.out.println(amount);
		  //  amount = 0;
		}
	}
}
