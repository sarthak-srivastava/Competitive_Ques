class longestBitonicSubsequence
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 11, 2, 10, 4, 5, 2, 1 };
        int lis = lbsTab(arr);
        System.out.println("Length of longest bitonic subsequence is "+lis);
    }

    public static int lbsTab(int[] arr)
    {
        int[] lis = new int[arr.length];
        String[] plis = new String[arr.length];

        lis[0] = 1;
        plis[0] = arr[0] + " ";
        // int max = 0;
        // int max_ind = 0;
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
        }
        
        
        int[] lds = new int[arr.length];
        String[] plds = new String[arr.length];

        lds[arr.length-1] = 1;
        plds[arr.length-1] = arr[arr.length-1] + " ";
        
        for(int i = arr.length-2; i>=0;i--)
        {
            for(int j = arr.length-1;j>i;j--)
            {
            if(arr[j]<arr[i] && lds[j]>lds[i])
             {   
                 lds[i] = lds[j];
                 plds[i] = plds[j];
                }
            }
            lds[i]++;
            plds[i] =arr[i]+" "+ plds[i];
        }
        int max = 0;
        int max_ind = 0;
        for(int k = 0;k<arr.length;k++)
        {
            if(max<(lis[k]+lds[k]))
            {
                max = lis[k]+lds[k]-1;
                max_ind = k;
            }
        }
        System.out.println("The longest bitonic subsequence is "+plis[max_ind]+plds[max_ind].substring(1));
        // System.out.println(plds[max_ind]);
        return max;
    }
}