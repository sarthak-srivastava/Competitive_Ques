import java.util.*;
class quickSort {
    public static void main(String[] args)
    {
        int[] arr = {9,2,5,1,6,7,0};
        int[] sorted = quicksort(arr,0,arr.length-1);
        for(int i:sorted)
        {
            System.out.print(i+" ");
    }
}
public static int[] quicksort(int[]arr ,int lo, int hi){
    if(lo>=hi)
    return arr;
   int pivot = arr[hi];
    int pivIdx = partition(arr,lo,hi,pivot);
    quicksort(arr,lo,pivIdx-1);
    quicksort(arr,pivIdx+1,hi);
    return arr;
}
private static int partition(int[] arr, int lo, int hi, int pivot)
{
    int parIdx = lo;
    int itr = lo;
    while(itr<=hi)
    {
        if(arr[itr]<=pivot)
        {
            int temp = arr[parIdx];
            arr[parIdx] = arr[itr];
            arr[itr] = temp;
            itr++;
            parIdx++;

        }
        else
        itr++;
    }
    return parIdx-1;
}



}