import java.util.*;
class ThreeSum {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findTriplet(arr,sum));
    }
    public static ArrayList<Integer> findTriplet(int[] arr, int sum)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = arr.length-1;
        for(i = 0; i< arr.length - 2; i++)
        {
            int k = i+1;
            while(k<j){
            if(arr[i]+arr[j]+arr[k] == sum)
            {
                ans.add(arr[i]);
                ans.add(arr[k]);
                ans.add(arr[j]);

                 return ans; }
            if(arr[i]+arr[j]+arr[k]<sum)
            {
                i++;    
            }      
            if(arr[i]+arr[j]+arr[k]>sum)
            j--;
        }
    }
        return ans;
    }
}