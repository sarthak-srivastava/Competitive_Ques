public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        
        String[] arr = new String[A.length];
        for(int i = 0;i<A.length;i++)
        {
            arr[i] = String.valueOf(A[i]);
        }
        Arrays.sort(arr,new Comparator<String>(){
            public int compare(String a, String b)
            {
                return (b+a).compareTo(a+b);
            }
        });
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<arr.length;i++)
        ans.append(arr[i]);
        while(ans.charAt(0) == '0' && ans.length()>1)
        ans.deleteCharAt(0);
        return ans.toString();
    }
}
