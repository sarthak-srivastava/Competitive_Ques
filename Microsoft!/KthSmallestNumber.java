import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t= sc.nextInt();
	 while(t-->0)
	 {
	     int n = sc.nextInt();
	     PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> (a - b));
	     for(int i = 0; i<n; i++)
	     pq.add(sc.nextInt());
	     int k = sc.nextInt();
	     for(int i = 1; i<k ; i++)
	     pq.poll();
	     System.out.println(pq.poll());
	     
	 }
	 }
}
