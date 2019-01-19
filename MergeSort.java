import java.util.*;
class MergeSort{
    public static void main(String[] args)
    {
        int[] arr = {2,1,0,5,9,6,3,7};
        int[] merged = mergeSort(arr,0,arr.length-1);
        for(int i = 0; i<merged.length; i++)
        {
            System.out.print(merged[i]+" ");
        }
    }
    public static int[] merge(int[] one, int[] two)
    {
        int[] merged = new int[one.length + two.length];
        int i = 0 ;
        int j = 0;
        int k = 0;
        while(i<one.length && j<two.length)
        {
            if(one[i]<two[j])
            {
                merged[k] = one[i];
                i++;
                k++;

            }
            else
            {
                merged[k] = two[j];
                j++;
                k++;
            }
        }
        while(i<one.length )
        {
            
                merged[k] = one[i];
                i++;
                k++;

            }
            while(j<two.length)
        {
        
                merged[k] = two[j];
                j++;
                k++;

            }
            return merged;
    }
    public static int[] mergeSort(int[] arr, int lo, int hi)
    {   if(lo==hi)
        {
            return new int[] {arr[lo]} ;
        }
        int mid = (lo+hi)/2;
        int[] fhalf = mergeSort(arr,lo,mid);
        int[] shalf = mergeSort(arr,mid+1,hi);
        int[] sorted = merge(fhalf,shalf);
        return sorted;
    }
}