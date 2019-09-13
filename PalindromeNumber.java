class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if(str.length()<=1)
            return true;
        if(str.charAt(0)=='-')
            return false;
        int i = 0, j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
