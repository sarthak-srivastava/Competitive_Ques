class minEdits{
    static int min(int a,int b, int c)
    {
        return (a<b?(a<c?a:c):(b<c?b:c));
    }
    static int editDistance(String str1, String str2, int m, int n,int[][] dp)
    {
        if(m == 0)
        return n;
        if(n == 0)
        return m;
        if(dp[m][n]!=0)
        return dp[m][n];

        if(str1.charAt(m-1) == str2.charAt(n-1))
        return dp[m][n] = editDistance(str1,str2,m-1,n-1,dp);

        return dp[m][n] = 1+min(editDistance(str1,str2,m-1,n,dp),editDistance(str1,str2,m-1,n-1,dp),editDistance(str1,str2,m,n-1,dp));

    }
    public static void main(String[] args)
    {
        String a = "abcdf";
        String b = "adce";
        int[][] dp = new int[a.length()+1][b.length()+1];
        System.out.println(editDistance(a,b,a.length(),b.length(),dp));
    }
}