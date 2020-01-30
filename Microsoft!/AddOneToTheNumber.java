public class Solution {
    public int[] plusOne(int[] A) {
    int carry = 0;
    while(A[0] == 0 && A.length!=1)
    {
         int[] temp = new int[A.length-1];
         for(int i = 0;i<A.length-1;i++)
         temp[i] = A[i+1];
         A = temp;
    }
    
    
    A[A.length-1] += 1;
    carry = A[A.length-1]/10;
    A[A.length-1] = A[A.length-1]%10;
    for(int i = A.length-2;i>=0;i--)
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
