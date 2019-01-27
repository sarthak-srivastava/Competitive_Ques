class minEdits{
    static int min(int a,int b, int c)
    {
        return (a<b?(a<c?a:c):(b<c?b:c));
    }
    static int editDistance(String str1, String str2, int m, int n)
    {
        if(m == 0)
        return n;
        if(n == 0)
        return m;

        if(str1.charAt(m-1) == str2.charAt(n-1))
        return editDistance(str1,str2,m-1,n-1);

        return 1+min(editDistance(str1,str2,m-1,n),editDistance(str1,str2,m-1,n-1),editDistance(str1,str2,m,n-1));

    }
    public static void main(String[] args)
    {
        String a = "abcdf";
        String b = "adce";
        System.out.println(editDistance(a,b,a.length(),b.length()));
    }
}