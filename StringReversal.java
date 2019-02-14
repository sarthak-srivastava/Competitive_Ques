class Solution {
    static int j = 0;
    public void reverseString(char[] s) {
        // char[] a =Arrays.copyOf(s);
        j = 0;
        reverse(s,0);
        // System.out.println(s);
    }
    public static void reverse(char[] s, int i)
    { 
        if(i == s.length)
            return;
        reverse(s,i+1);
        if(j>=s.length/2)
        {return;
            }
        char t = s[i];
        s[i] = s[j];
        s[j] =t;
        j++;
       
        
        
    }
}
