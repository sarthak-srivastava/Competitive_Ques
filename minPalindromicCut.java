class minPalindromicCut{
    public static void main(String[] args)
    {
        String str = "abccbc";
        System.out.println(PalindromicCut(str, 0, str.length()-1));
    }
    public static int PalindromicCut(String str, int si, int ei)
    {
        if(isPalindrome(str,si,ei) == true)
        return 0;
        int mpc = Integer.MAX_VALUE;
        for(int cp = si; cp<ei; cp++)
        {
            int mpcsubstring1 = PalindromicCut(str, si, cp);
            int mpcsubstring2 = PalindromicCut(str, cp+1, ei);
            int totalcost = mpcsubstring1 + mpcsubstring2+1;
            if(totalcost<mpc)
            mpc = totalcost;
        }
        return mpc;
    }
    public static boolean isPalindrome(String str, int si, int ei)
    {
        int start = si;
        int end = ei;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            return false;
            start++;
            end--;
        }
        return true;
    }
}