class Solution {
    public int repeatedStringMatch(String A, String B) {
        if(A.length() == 0)
            return -1;
        if(B.length() == 0)
            return 1;
        int i = 0;
        int j = 0;
        int k = 0;
        int repeats = 0;
        while(j<B.length()){
            if(A.charAt(i) == B.charAt(j))
            {
                i++;
                j++;
                if(i == A.length())
                {
                    i = 0;
                    repeats++;
                }
            }
            else
            {
                k++;
                if(k == A.length())
                    return -1;
                i = k;
                repeats = 0;
                j = 0;
            }
        }
        if(i>0)
            repeats++;
        return repeats;
    }
}
