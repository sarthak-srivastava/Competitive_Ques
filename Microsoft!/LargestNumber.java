public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
    String[] arr = new String[A.length];
    for(int i = 0; i< A.length; i++)
    {
        arr[i] = Integer.toString(A[i]);
    }
    Arrays.sort( arr, (a,b) -> (b + a).compareTo(a + b));
    
    StringBuilder sb = new StringBuilder();
    for(String str : arr)
    sb.append(str);
    // System.out.println(sb);
    while(sb.length() > 1 && sb.charAt(0) == '0' )
    {
        sb.delete(0,1);
    }
    return sb.toString();
    

    }
}
