public class Solution {
    public int[] plusOne(int[] A) {
    int carry = 0;
    int i = 0;
    while(A[i] == 0 && A.length!=i+1)
    {
         i++;
    }
    int[] temp = new int[A.length-i];
         for(int k = 0;k<A.length- i;k++)
         temp[k] = A[i+k];
        //  A = temp;
        A = temp;
    
    A[A.length-1] += 1;
    carry = A[A.length-1]/10;
    A[A.length-1] = A[A.length-1]%10;
    for( i = A.length-2;i>=0;i--)
    {
        A[i] += carry;
        carry = A[i]/10;
        A[i] = A[i]%10;
        
    }
    int[] B = new int[A.length+1];
    if(carry>0)
    {
        System.arraycopy(A,0,B,1,A.length);
        B[0] = carry;
        return B;
    }
    
    return A;
    }
}
