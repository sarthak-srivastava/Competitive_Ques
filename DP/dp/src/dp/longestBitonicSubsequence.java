class longestBitonicSubsequence
{
    public static void main(String[] args)
    {
        int[] arr = {10,22,9,33,21,50,41,60,80,1};
        int lis = lbsTab(arr);
        System.out.println("Length of longest increasing subsequence is "+lis);
    }

    public static int lbsTab(int[] arr)
    {
        int[] lis = new int[arr.length];
        String[] plis = new String[arr.length];

        lis[0] = 1;
        plis[0] = arr[0] + " ";
        int max = 0;
        int max_ind = 0;
        for(int i = 1; i<arr.length;i++)
        {
            for(int j = 0;j<i;j++)
            {
            if(arr[j]<arr[i] && lis[j]>lis[i])
             {   
                 lis[i] = lis[j];
                 plis[i] = plis[j];
                }
                

            }
            lis[i]++;
            plis[i] +=arr[i]+" ";
            if(lis[i]>max)
            {
                max = lis[i];
                max_ind = i;
            }
        }
        System.out.println("The longest Increasing Subsequence is: "+plis[max_ind]);
        return lis[max_ind];
    }
}