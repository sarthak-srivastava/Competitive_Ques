import java.util.*;
class equalSumSet {
    public static void main(String[] args)
    {   int[] arr = {10,20,30,40,50,60,70};
        printSS(arr,"",0,"",0,0);
    }
    public static void printSS(int[] arr, String s1, int sums1, String s2, int sums2,int vidx)
    {   if(vidx == arr.length){
        if(sums1 == sums2 )
        {
            System.out.println(s1 + "  "+ s2);
            
        }
        return;
    }
        else
        {
           
                printSS(arr,s1+" "+arr[vidx],sums1+arr[vidx],s2,sums2,vidx+1);
                printSS(arr,s1,sums1,s2+" "+arr[vidx],sums2+arr[vidx],vidx+1);
            
        }
    }
}