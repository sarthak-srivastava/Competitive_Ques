// Code to return index of first occurence of a number in an array using recursion. If element is not present, then return -1.
import java.util.*;
class firstIndex {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        System.out.println(firstInd(arr,0,n));
    }
    public static int firstInd(int[] arr,int vidx, int n)
    {   if(vidx == arr.length)
        return -1;
        if(arr[vidx]==n)
        return vidx;
        else
        return firstInd(arr,vidx+1,n);
    }
}