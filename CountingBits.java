class Solution {
    public int[] countBits(int num) {
        int arr[] = new int[num+1];
        for(int i = 0;i<=num;i++)
            arr[i] = arr[i/2] + (i%2);
        return arr;
    }
}
