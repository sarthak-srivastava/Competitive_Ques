class NumCavities {  
  
    static int MAX = 100;  
      
    static int countCavities(int a[][], int n)  
    {  
        int A[][] = new int[n + 2][n + 2];  
        int count = 0;  
      
        
        for (int i = 0; i < n + 2; i++) {  
            for (int j = 0; j < n + 2; j++) {  
                if ((i == 0) || (j == 0) || (i == n + 1) || (j == n + 1))  
                    A[i][j] = Integer.MAX_VALUE;  
                else
                    A[i][j] = a[i - 1][j - 1];  
            }  
        }  
      
        // Check for cavities in the modified matrix  
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= n; j++) {  
      
                // check for all directions  
                if ((A[i][j] < A[i - 1][j]) && (A[i][j] < A[i + 1][j]) &&  
                    (A[i][j] < A[i][j - 1]) && (A[i][j] < A[i][j + 1]) &&  
                    (A[i][j] < A[i - 1][j - 1]) && (A[i][j] < A[i + 1][j + 1]) &&  
                    (A[i][j] < A[i - 1][j + 1]) && (A[i][j] < A[i + 1][j - 1]))  
                    count++;  
            }  
        }  
      
        return count;  
    }  