import java.util.*;
class MergeSort{
    public static void main(String[] args)
    {
        int[] one = {2,5,9,15,19,20};
        int[] two = {0,3,7,8,11};
        int[] merged = merge(one,two);
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
}