import java.util.*;
class SubsetSum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {10,20,30,40,50,60,70};
        printSS(arr,n,0,"",0);
    }
    public static void printSS(int[] arr, int tar, int sumset, String ss, int vidx)
    {   if(vidx == arr.length-1)
        {
            if(sumset == tar)
            System.out.println(ss);
            return;
        }
        printSS(arr,tar,sumset+arr[vidx],ss+" "+arr[vidx], vidx+1);
        printSS(arr,tar,sumset,ss, vidx+1);
    }

}