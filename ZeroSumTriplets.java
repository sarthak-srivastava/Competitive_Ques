{
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			GfG g=new GfG();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
	public boolean findTriplets(int arr[] , int n)
       {
         //add code here.
         Arrays.sort(arr);
         HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
         for(int i = 0;i<arr.length;i++)
         {
             if(!hs.containsKey(arr[i]))
             hs.put(arr[i],1);
             else
             hs.put(arr[i],hs.get(arr[i])+1);
         }
         for(int i = 0;i<arr.length;i++)
         {  
             for(int j = i+1;j<arr.length;j++)
             {
                 if(hs.containsKey(-(arr[i]+arr[j])) )
                 {  if(arr[i] == -(arr[i]+arr[j]) || arr[j] == -(arr[i]+arr[j])){
                    if(hs.get(-(arr[i]+arr[j]))>1){
                    //  System.out.println(arr[i]+" "+arr[j]+" "+(-(arr[i]+arr[j])));
                 return true;}
                 }
                 else
                 return true;
             }
             }
         }
         return false;
       }
}
