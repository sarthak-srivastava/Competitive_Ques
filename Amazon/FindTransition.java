{
import java.util.*;
class Sorted_Array
{  
    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n =sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			GfG obj = new GfG();
			System.out.println(obj.transitionPoint(arr,n));
			T--;
		}	
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
	int transitionPoint(int arr[],int n)
	{
             // Your code here
             int lo = 0;
             int hi = n-1;
             int mid = lo;
             while(lo<=hi)
             {
                 mid = lo+(hi-lo)/2;
                 if(arr[mid] == 0 && arr[mid+1] == 1)
                 break;
                 if(arr[mid] == 0)
                 lo = mid+1;
                 else
                 hi = mid-1;
             }
             return mid+1;
        } 
}
