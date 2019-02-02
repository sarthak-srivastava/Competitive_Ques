import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
    
    
    static class SortingBasedOnEndTime implements Comparator<Station>
    {
        SortingBasedOnEndTime()
        {
        
        }
    
        public int compare(Station st1,Station st2)
        {
            return st1.end-st2.end;
        }
    }
    
    static class Station
    {
        Station()
        {
            start=0;
            end=0;
        }
        
        int start;
        int end;
    }
    
    // public static void ActivitySelection(int[] start,end,n)
    // {
        
    // }
    
    public static int ActivitySelection(Station[] stations,int n)
    {
        Arrays.sort(stations,new SortingBasedOnEndTime());
        
        int count=1;
        
        int latestEndTime=stations[0].end;
        
        for(int i=1;i<n;i++)
        {
            if(stations[i].start >= latestEndTime)
            {
                count++;
                latestEndTime=stations[i].end;
            }
        }
        
        return count;
    }
    
	public static void main (String[] args){
		//code
// 		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int testCases=sc.nextInt();
        
        while(testCases-- > 0)
        {
            int n=sc.nextInt();
            
            int []start=new int[n];
            int []end=new int[n];
            
            // String []sArr=br.readLine().split("\\s+");
            
            Station[] stations=new Station[n];
            
            
            
            for(int i=0;i<n;i++)
            {
                stations[i]=new Station();
                stations[i].start=sc.nextInt();
                //start[i]=
            }
            
            // sArr=br.readLine().split("\\s+");
            
            for(int i=0;i<n;i++)
            {
                stations[i].end=sc.nextInt();
                // end[i]=Integer.parseInt(sArr[i]);
            }
            System.out.println(ActivitySelection(stations,n));
        }
	}
}
