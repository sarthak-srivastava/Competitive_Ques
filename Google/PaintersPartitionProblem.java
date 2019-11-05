public class Solution {
    public int paint(int A, int B, ArrayList<Integer> C) {
    if(C==null||C.size()==0)
        return 0;
    if(A<=0)
        return Integer.MAX_VALUE;
    if(A == 1)
        {
            long sum = 0;
            for(int i = 0;i<C.size();i++)
            sum = (sum%10000003 + C.get(i)%10000003)%10000003;
            return (int)(((sum%10000003)*(B%10000003))%10000003) ;
        }
    long low = B;
    long high = Long.MAX_VALUE;
    long answer = high;
    while (low < high)
    {
        long mid = (low + high) / 2;
        boolean isPossible = IsPossible(A,B, C, mid);
        if (isPossible)
        {
            high = mid;
            answer = Math.min(answer, mid);
        }
        else
        {
            low = mid + 1;
        }
    }
 
    return (int) ((answer) % 10000003);
    }
    public boolean IsPossible(int inputPainters,int B, ArrayList<Integer> lengths, long time)
{
    long sum = 0;
    sum = lengths.get(0)*B;
    long minimumPainters = 1;
    for (int count = 1; count < lengths.size(); count++)
    {
        if(lengths.get(count)*B>time ||minimumPainters>inputPainters)
            return false;
        if (lengths.get(count)*B + sum <= time)
        {
            sum = lengths.get(count)*B + sum;
        }
        else
        {
            sum = lengths.get(count)*B;
            minimumPainters++;
        }
    
    }
    return minimumPainters <= inputPainters;
}
}
