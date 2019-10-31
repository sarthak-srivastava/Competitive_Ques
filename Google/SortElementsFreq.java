import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static class datapoint{
    int num;
    int freq;
    datapoint(int n, int f)
    {
        num = n;
        freq = f;
    }
    
}
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0)
	 {
	     HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	     int n = sc.nextInt();
	     PriorityQueue<datapoint> pq = new PriorityQueue<datapoint>(new Comparator<datapoint>(){
	         public int compare(datapoint a, datapoint b)
	         {
	             if(a.freq>b.freq)
	             return -1;
	             else if (a.freq == b.freq)
	             {
	                 if(a.num>b.num)
	                 return 1;
	                 else
	                 return -1;
	             }
	             else
	             return 1;
	         }
	     });
	     for(int i = 0; i<n;i++)
	     {
	         int curr_inp = sc.nextInt();
	         if(hm.containsKey(curr_inp))
	         {
	             hm.put(curr_inp,hm.get(curr_inp)+1);
	         }
	         else
	         hm.put(curr_inp,1);
	     }
	     for(Map.Entry<Integer,Integer> entry : hm.entrySet()) 
	     {
	         int num = entry.getKey();
	         int freq = entry.getValue();
	         pq.add(new datapoint(num,freq));
	         
	 }
	 while(pq.size()>0){
	     datapoint tmp = pq.remove();
	     int num = tmp.num;
	         int freq = tmp.freq;
	     while(freq-->0)
	         {
	             System.out.print(num+" ");
	         
	     }
	 }
	 System.out.println();
	 }
}

}
