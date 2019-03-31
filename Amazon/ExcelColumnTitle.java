public class Solution {
    public String convertToTitle(int A) {
        String ans = "";
        while(A>0)
        {
            int rem = A%26;
            if(rem == 0)
            {
                ans = ans+'Z';
                A = A/26 -1;
            }
            else{
            char c = (char)(rem+64) ;
            ans = ans+c;
            A = A/26;
    }    }
        String a = "";
        for(int i = ans.length()-1;i>=0;i--)
        a = a+ans.charAt(i);
        return a;
    }
}
