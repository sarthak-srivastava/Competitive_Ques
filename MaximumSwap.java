class Solution {
    public int maximumSwap(int num) {
        String num_str = Integer.toString(num);
        int[] arr = new int[num_str.length()];
        for(int i = 0;i<arr.length;i++)
            arr[i] = num_str.charAt(i) - '0';
        int[] largest = new int[arr.length];
        largest[largest.length - 1] = largest.length - 1;
        for(int i = largest.length - 2; i>=0; i--)
        {
            if(arr[largest[i+1]]>=arr[i])
                largest[i] = largest[i+1];
            else
                largest[i] = i;
        }
        for(int i = 0; i<arr.length - 1;i++)
        {
            if(arr[largest[i]]>arr[i])
            {
                int temp = arr[largest[i]];
                arr[largest[i]] = arr[i];
                arr[i] = temp;
                int ans = 0;
                for(int j=0;j<arr.length;j++)
                    ans = ans*10 + arr[j];
                return ans;
            }
        }
        return num;
    }
}
