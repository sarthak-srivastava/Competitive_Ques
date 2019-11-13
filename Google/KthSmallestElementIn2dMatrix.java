class Solution {
    private class Node
    {
        int row;
        int col;
        int val;
        Node(int r, int c)
        {
            row = r;
            col = c;
            // val = data;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length == 0 || k<=0)
            return -1;
        PriorityQueue<Node> pq = new PriorityQueue<Node>((a,b) -> (matrix[a.row][a.col] - matrix[b.row][b.col]));
        for(int i = 0; i<matrix.length;i++)
            pq.add(new Node(i,0));
        int count = 0;
        int ans =  -1;
        while(count<k &&pq.size()>0)
        {   count++;
            Node curr = pq.poll();
            ans = matrix[curr.row][curr.col];
            int j = curr.col;
            j++;
            if(j<matrix[0].length)
            pq.add(new Node(curr.row,j));
        }
        return ans;
    }
}
