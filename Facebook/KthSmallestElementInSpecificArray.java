public class Solution {
    /**
     * @param arr: an array of integers
     * @param k: an integer
     * @return: the Kth smallest element in a specific array
     */
    public class pair
    {
        int val;
        int r;
        int c;
        pair(int val, int r, int c)
        {
            this.val = val;
            this.r = r;
            this.c = c;
        }
    }
    
    public int kthSmallest(int[][] arr, int k) {
        // write your code here
        PriorityQueue<pair> pq = new PriorityQueue<pair>((a,b) -> (a.val - b.val));
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i].length>0)
            pq.add(new pair(arr[i][0],i,0));
        }
        for(int i = 0; i<k-1; i++)
        {
            pair curr = pq.poll();
            if(curr.c < arr[curr.r].length-1){
            curr.c++;
            pq.add(new pair(arr[curr.r][curr.c],curr.r,curr.c));}
        }
        pair curr =  pq.poll();
        return curr.val;
    }
}
