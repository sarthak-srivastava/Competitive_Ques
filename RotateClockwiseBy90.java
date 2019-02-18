class Solution {
    public void rotate(int[][] a) {
        int N = a.length;
         for (int i = 0; i < N / 2; i++) 
    { 
        for (int j = i; j < N - i - 1; j++) 
        { 
  
            // Swap elements of each cycle 
            // in clockwise direction 
            int temp = a[i][j]; 
            a[i][j] = a[N - 1 - j][i]; 
            a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j]; 
            a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i]; 
            a[j][N - 1 - i] = temp; 
        } 
    }
    }
}
