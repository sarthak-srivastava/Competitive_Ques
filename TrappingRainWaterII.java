class Solution {
    public int trapRainWater(int[][] heightMap) {
         Queue<int[]> pq = new PriorityQueue<>((a, b)->(a[2] - b[2]));
        int n = heightMap.length;
        if (n < 2) {
            return 0;
        }
        int m = heightMap[0].length;
        if (m < 2) {
            return 0;
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            visited[i][0] = true;
            visited[i][m - 1] = true; 
            pq.add(new int[]{i, 0, heightMap[i][0]});
            pq.add(new int[]{i, m - 1, heightMap[i][m - 1]});
        }
        for (int j = 0; j < m; j++) {
            visited[0][j] = true;
            visited[n - 1][j] = true; 
            pq.add(new int[]{0, j, heightMap[0][j]});
            pq.add(new int[]{n - 1, j, heightMap[n - 1][j]});
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny]) {
                    continue;
                }
                if (heightMap[nx][ny] < temp[2]) {
                    sum += temp[2] - heightMap[nx][ny];
                }
                visited[nx][ny] = true;
                pq.add(new int[]{nx, ny, Math.max(temp[2], heightMap[nx][ny])});
            }
        }
        return sum;
    }
}
